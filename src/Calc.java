/**
 * Interfaz que define el contrato para calculadoras.
 * Cualquier clase que implemente esta interfaz debe poder
 * procesar operaciones matemáticas desde un String.
 * 
 * @author Fabricio Estrada 25230 Marco Prera 25468
 * @version 1.0
 */
public interface Calc {
    /**
     * Procesa y evalúa una expresión matemática.
     * 
     * @param input La expresión a evaluar
     * @return El resultado de la operación
     */
    public double operate(String input);
}