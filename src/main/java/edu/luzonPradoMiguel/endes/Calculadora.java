package edu.luzonPradoMiguel.endes;

/**
 * Clase que realiza operaciones aritméticas básicas.
 */
public class Calculadora {

    /**
     * Suma dos números.
     * @param a primer número
     * @param b segundo número
     * @return resultado de la suma
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números.
     * @param a primer número
     * @param b segundo número
     * @return resultado de la resta
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números.
     * @param a primer número
     * @param b segundo número
     * @return resultado de la multiplicación
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números.
     * @param a dividendo
     * @param b divisor
     * @return resultado de la división
     * @throws IllegalArgumentException si el divisor es 0
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }
}