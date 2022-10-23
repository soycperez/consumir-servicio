package dev.cperez.com.implementacion;

import dev.cperez.com.entidad.Dato;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Cesar Perez
 */
public class ImpDato extends ImpGenerica {

    String dominio = "https://serviciosdigitalesplus.com/servicio/servicio.php";
    Dato datoC = null;

    public void leerJson(Dato dato) {
        try {
            // 1.- Definimos la URL del servicio
            String query = dominio + "?tipo=1&clave=" + dato.getClave();
            URL url = new URL(query);

            // 2.- Realizamos la conexion y peticion al servicio
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int respondeCode = conn.getResponseCode();
            if (respondeCode == HttpURLConnection.HTTP_OK) {
                // 3.- Almacenamos la informacion retornada
                StringBuilder informationJson = new StringBuilder();
                // Inciamos conexion TCP para recuperar la carga de datos de la url con el metod openStream()
                Scanner lectura = new Scanner(conn.getInputStream());
                while (lectura.hasNext()) {
                    informationJson.append(lectura.nextLine());
                }
                lectura.close();

                // 4.- Almacenamos la información en variable de tipo Sting
                String dataJson = informationJson.toString();
                // Deserealizamos el JSON
                JSONArray arrayDato = deserealizarJson(dataJson);
                //System.out.println(data);
                insertarLista(arrayDato);
                System.out.println(lista);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public JSONArray deserealizarJson(String dataJson) {
        // Usamos la libreria JSON para volver la cadena a un Objeto JSON
        JSONObject jsonObj = new JSONObject(dataJson);
        // Deserializamos el JSON y extraemos el vector "dato" que contiene toda la informacion
        JSONArray arrayDato = jsonObj.getJSONArray("dato");
        return arrayDato;
    }

    public void insertarLista(JSONArray arrayDato) {

        for (int i = 0; i < arrayDato.length(); i++) {
            JSONObject jsonObjComodin = arrayDato.getJSONObject(i);
            datoC = new Dato(jsonObjComodin.getString("id"), jsonObjComodin.getString("nom"),
                    jsonObjComodin.getString("app"), jsonObjComodin.getString("tel"), jsonObjComodin.getString("clave"));
            lista.add(datoC);
        }
    }
    
    
}
