/**
 * Implementación de una pila genérica usando un arreglo de objetos.
 * Tiene capacidad fija de 10 elementos.
 * Proporciona operaciones LIFO (Last In, First Out).
 * 
 * @param <T> El tipo de elementos que almacenará la pila
 * @author Fabricio Estrada 25230 Marco Prera 25468
 * @version 1.0
 */
public class StackO<T> implements Stack<T> {
    
    /** Arreglo que almacena los elementos */
    private Object[] data;
    
    /** Índice del elemento en el tope de la pila */
    private int top;
    
    /** Capacidad máxima de la pila */
    private int capacity;

    /**
     * Constructor que inicializa una pila con capacidad de 10 elementos.
     */
    public StackO() {
        data = new Object[10];
        capacity = 10;
        top = -1;
    }

    /**
     * Agrega un elemento al tope de la pila.
     * Si la pila está llena, muestra un mensaje de overflow.
     * 
     * @param value El elemento a agregar
     */
    @Override
    public void push(T value) {
        if (top == capacity - 1) {
            message("Stack overflow");
            return;
        }
        data[++top] = value;
    }

    /**
     * Remueve y retorna el elemento en el tope de la pila.
     * 
     * @return El elemento removido, o null si la pila está vacía
     */
    @Override
    public T pop() {
        if (top == -1) {
            message("Stack underflow");
            return null;
        }
        T value = (T) data[top];
        data[top--] = null;
        return value;
    }

    /**
     * Retorna el elemento en el tope sin removerlo.
     * 
     * @return El elemento en el tope, o null si la pila está vacía
     */
    @Override
    public T peek() {
        if (top == -1) {
            message("Stack underflow");
            return null;
        }
        T value = (T) data[top];
        return value;
    }

    /**
     * Imprime un mensaje en consola.
     * 
     * @param message El mensaje a mostrar
     */
    public void message(String message) {
        System.out.println(message);
    }
}