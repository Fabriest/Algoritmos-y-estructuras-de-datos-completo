public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Reader reader = new Reader();

        String expression = reader.TextReader("Datos.txt");

        double result = calc.operate(expression);
        System.out.println("Result: " + result);
        
    }
}
