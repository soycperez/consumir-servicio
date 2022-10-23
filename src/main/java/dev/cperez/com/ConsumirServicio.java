package dev.cperez.com;

import dev.cperez.com.entidad.Dato;
import dev.cperez.com.implementacion.ImpDato;

/**
 *
 * @author Cesar Perez
 */
public class ConsumirServicio {

    public static void main(String[] args) {
        
        ImpDato impDato = new ImpDato(); 
        Dato dato = new Dato(); 
        dato.setClave("201853826"); 
        System.out.println("Consultar datos:");
        impDato.leerJson(dato);
        
        System.out.println("Modificar Datos:");
    }
}
