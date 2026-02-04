import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Calculator implements Calc {
    
    public double operate(String input) {
        return 0.0; // Placeholder return value
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.TextReader("text.txt");
        System.out.println("Result: " + result);
    }

    public double TextReader(String filePath) {
            try {
                String content = Files.readString(Paths.get(filePath));
                return operate(content.trim());

            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                return 0.0;
            }
    }
}


