package dev.cperez.com.implementacion;

/**
 *
 * @author Cesar Perez
 */
public class ImpValidaciones {
   
    public boolean validarAlfabeticos(int key) {
        boolean ctrl = key == 127;
        boolean borrar = key == 8;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean ctrlA = key == 1;
        return ctrl || borrar || minusculas || mayusculas || espacio || ctrlA;
    }

    public boolean validarNumericos(int key) {
        boolean ctrl = key == 127;
        boolean borrar = key == 8;
        boolean numeros = key >= 48 && key <= 57;
        boolean ctrlA = key == 1;
        return ctrl || borrar || numeros || ctrlA;
    }

}
