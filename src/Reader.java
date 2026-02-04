import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

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
