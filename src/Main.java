/**
 * Clase principal que ejecuta la calculadora postfix.
 * Lee una expresión desde un archivo y la evalúa.
 * 
 * @author Fabricio Estrada 25230 Marco Prera 25468
 * @version 1.0
 */
public class Main {
    /**
     * Método principal que inicia el programa.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Reader reader = new Reader();

        String expression = reader.TextReader("Datos.txt");

        double result = calc.operate(expression);
        System.out.println("Result: " + result);
    }
}