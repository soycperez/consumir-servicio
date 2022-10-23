package dev.cperez.com;

import dev.cperez.com.entidad.Dato;
import dev.cperez.com.implementacion.ImpDato;
import java.util.List;

/**
 *
 * @author Cesar Perez
 */
public class ConsumirServicio {

    public static void main(String[] args) {

        ImpDato impDato = new ImpDato();
        Dato dato = new Dato();
        Dato datoC = null;
        dato.setClave("201853826");
        System.out.println("1.- Consultar datos:");
        impDato.leerJson(dato);

        /*System.out.println("2.- Crear :");
        dato.setNom("PRUEBA");
        dato.setApp("PRUEBA");
        dato.setTel("PRUEBA");
        impDato.crearJson(dato);*/

        System.out.println("3.- Modificar Datos:");
        // Para editar, primero hay que modificar
        datoC = (Dato) impDato.recuperar(0);
        datoC.setNom("Alexis");
        datoC.setApp("Mejia");
        datoC.setTel("22222222");
        System.out.println(datoC);
        impDato.editarJson(datoC);
        
        /*System.out.println("Recuperar lista listaDatoMain:");
        List<Dato> listaDatoMain = (List<Dato>) (Object) impDato.recuperarLista(); 
        System.out.println(listaDatoMain);*/

    }
}
