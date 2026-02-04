/**
 * Interfaz genérica que define las operaciones básicas de una pila (Stack).
 * 
 * @param <T> El tipo de elementos que almacenará la pila
 * @author Fabricio Estrada 25230 Marco Prera 25468
 * @version 1.0
 */
public interface Stack<T> {
    /**
     * Agrega un elemento al tope de la pila.
     * 
     * @param item El elemento a agregar
     */
    public void push(T item);
    
    /**
     * Remueve y retorna el elemento en el tope de la pila.
     * 
     * @return El elemento removido del tope
     */
    public T pop();
    
    /**
     * Retorna el elemento en el tope sin removerlo.
     * 
     * @return El elemento en el tope de la pila
     */
    public T peek();
}