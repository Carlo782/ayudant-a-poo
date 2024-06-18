import java.io.IOException;

/**
 * Interfaz que define las operaciones CRUD (Crear, Leer, Actualizar, Borrar) para el manejo de archivos.
 */
public interface Crud {

     /**
      * Crea un archivo en la ruta especificada.
      *
      * @param ruta La ruta del archivo a crear.
      * @throws IOException Si ocurre un error de entrada/salida.
      */
     void create(String ruta) throws IOException;

     /**
      * Lee el contenido de un archivo en la ruta especificada.
      *
      * @param ruta La ruta del archivo a leer.
      * @return El contenido del archivo.
      * @throws IOException Si ocurre un error de entrada/salida.
      */
     String read(String ruta) throws IOException;

     /**
      * Actualiza el contenido de un archivo en la ruta especificada.
      *
      * @param ruta La ruta del archivo a actualizar.
      * @param contenido El nuevo contenido a escribir en el archivo.
      * @throws IOException Si ocurre un error de entrada/salida.
      */
     void update(String ruta, String contenido) throws IOException;

     /**
      * Borra el archivo en la ruta especificada.
      *
      * @param ruta La ruta del archivo a borrar.
      * @throws IOException Si ocurre un error de entrada/salida.
      */
     void delete(String ruta) throws IOException;
}
