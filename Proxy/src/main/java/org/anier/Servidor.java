package org.anier;

public interface Servidor {

    String subir(String nomfich);

    Fichero bajar(String id);

    String listado();
}
