/**
 * Calculadora que evalúa expresiones en notación postfix (polaca inversa).
 * Utiliza una pila para procesar operadores y operandos.
 * 
 * Operadores soportados: +, -, *, /, ^
 * 
 * @author Fabricio Estrada 25230 Marco Prera 25468 
 * @version 1.0
 */
public class Calculator implements Calc {

    /** Pila utilizada para almacenar números durante la evaluación */
    StackA<Double> stack;
    
    /**
     * Constructor que inicializa la calculadora con una pila vacía.
     */
    public Calculator() {
        stack = new StackA<Double>();
    }
    
    /**
     * Evalúa una expresión en notación postfix.
     * 
     * La expresión debe contener números y operadores separados por espacios.
     * Ejemplo: "3 4 +" retorna 7.0
     * 
     * @param input La expresión postfix a evaluar
     * @return El resultado de la evaluación
     */
    public double operate(String input) {

        System.out.println("Input: " + input);

        for (String element : input.split(" ")) {
            

            switch (element) {
                case "+":
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a + b);
                    break;

                case "-":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a - b);
                    break;

                case "*":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a * b);
                    break;

                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;

                case "^":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(Math.pow(a, b));
                    break;

                default:
                    stack.push(Double.parseDouble(element));
                    break;
            }
        }

        return stack.peek(); 
    }
    

    
}


