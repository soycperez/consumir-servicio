package dev.cperez.com.implementacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar Perez
 */
public class ImpGenerica implements Metodo {

    List<Object> lista = new ArrayList();

    @Override
    public void guardar(Object obj) {
        lista.add(obj);
    }

    @Override
    public Object recuperar(int indice) {
        return lista.get(indice);
    }

    @Override
    public List<Object> recuperarLista() {
        return lista;
    }

    @Override
    public void editar(Object indice, Object obj) {
        lista.set((int) indice, obj);
    }

    @Override
    public void eliminar(Object obj) {
        lista.remove(obj);
    }

}
