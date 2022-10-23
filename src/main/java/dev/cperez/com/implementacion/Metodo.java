package dev.cperez.com.implementacion;

import java.util.List;

/**
 *
 * @author Cesar Perez
 */
public interface Metodo {

    void guardar(Object obj);

    List<Object> consultar(Object obj);

    void editar(Object indice, Object obj);

    void eliminar(Object obj);
}
