package edu.luzonPradoMiguel.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.restar(3, 2));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(6, 3));
    }

    @Test
    public void testDividirEntreCero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(5, 0));
    }
}
