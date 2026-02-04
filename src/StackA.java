import java.util.ArrayList;

/**
 * Implementación de una pila genérica usando ArrayList.
 * Proporciona operaciones LIFO (Last In, First Out).
 * 
 * @param <T> El tipo de elementos que almacenará la pila
 * @author Fabricio Estrada 25230 Marco Prera 25468
 * @version 1.0
 */
public class StackA<T> implements Stack<T> {
    
    /** Lista que almacena los elementos de la pila */
    private ArrayList<T> data1;

    /**
     * Constructor que inicializa una pila vacía.
     */
    public StackA() {
        data1 = new ArrayList<T>();
    }

    /**
     * Remueve y retorna el elemento en el tope de la pila.
     * 
     * @return El elemento removido del tope
     */
    @Override
    public T pop() {
        int length = data1.size();
        if (length == 0) {
            message("Stack underflow");
        }

        T value = data1.get(length - 1);
        data1.remove(length - 1);
        
        return value;
    }

    /**
     * Agrega un elemento al tope de la pila.
     * 
     * @param value El elemento a agregar
     */
    @Override
    public void push(T value) {
        data1.add(value);
    }

    /**
     * Retorna el elemento en el tope sin removerlo.
     * 
     * @return El elemento en el tope de la pila
     */
    @Override
    public T peek() {
        if (data1.size() == 0) {
            message("Stack underflow1");
        }
        int length = data1.size();
        T value = data1.get(length - 1);

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