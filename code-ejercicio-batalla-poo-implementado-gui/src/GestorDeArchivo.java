import java.io.*;

/**
 * Implementación de la interfaz Crud para operaciones básicas de manejo de archivos.
 */
public class GestorDeArchivo implements Crud {

    /**
     * Crea un nuevo archivo en la ruta especificada.
     *
     * @param ruta La ruta del archivo a crear.
     * @throws IOException Si ocurre un error de entrada/salida o si el archivo ya existe.
     */
    @Override
    public void create(String ruta) throws IOException {
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            archivo.createNewFile();
        } else {
            throw new IOException("El archivo ya existe");
        }
    }

    /**
     * Lee el contenido de un archivo en la ruta especificada.
     *
     * @param ruta La ruta del archivo a leer.
     * @return El contenido del archivo como una cadena de caracteres.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    @Override
    public String read(String ruta) throws IOException {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        }
        return contenido.toString();
    }

    /**
     * Actualiza el contenido de un archivo en la ruta especificada.
     *
     * @param ruta La ruta del archivo a actualizar.
     * @param contenido El nuevo contenido a escribir en el archivo.
     * @throws IOException Si ocurre un error de entrada/salida.
     */
    @Override
    public void update(String ruta, String contenido) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            writer.write(contenido);
        }
    }

    /**
     * Elimina un archivo en la ruta especificada.
     *
     * @param ruta La ruta del archivo a eliminar.
     * @throws IOException Si ocurre un error de entrada/salida o si el archivo no existe.
     */
    @Override
    public void delete(String ruta) throws IOException {
        File archivo = new File(ruta);
        if (archivo.exists()) {
            archivo.delete();
        } else {
            throw new IOException("Archivo no encontrado");
        }
    }
}
