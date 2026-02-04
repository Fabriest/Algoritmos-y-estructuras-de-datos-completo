import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Clase encargada de leer archivos de texto.
 * Extrae expresiones matemáticas desde archivos.
 * 
 * @author Fabricio Estrada 25230 Marco Prera 25468
 * @version 1.0
 */
public class Reader {

    /**
     * Lee la primera línea de un archivo de texto.
     * 
     * @param filePath La ruta del archivo a leer
     * @return La expresión leída del archivo, o cadena vacía si hay error
     */
        public String TextReader(String filePath) {
    try {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        String expression = scanner.nextLine().trim();
        scanner.close();
        return expression;

    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado: " + filePath);
        return "";
    }
}

    
}
