package dev.cperez.com.implementacion;

import java.util.List;

/**
 *
 * @author Cesar Perez
 */
public interface Metodo {

    public void guardar(Object obj);

    public Object recuperar(int indice);
    
    public List<Object> recuperarLista(); 

    public void editar(Object indice, Object obj);

    public void eliminar(Object obj);
}
