package edu.luzonPradoMiguel.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPasswordTest {

    @Test
    public void testPasswordValida() {
        ValidadorPassword validador = new ValidadorPassword();
        assertTrue(validador.esValida("Clave123"));
    }

    @Test
    public void testPasswordNull() {
        ValidadorPassword validador = new ValidadorPassword();
        assertFalse(validador.esValida(null));
    }

    @Test
    public void testPasswordCorta() {
        ValidadorPassword validador = new ValidadorPassword();
        assertFalse(validador.esValida("Abc12"));
    }

    @Test
    public void testPasswordSinMayuscula() {
        ValidadorPassword validador = new ValidadorPassword();
        assertFalse(validador.esValida("clave123"));
    }

    @Test
    public void testPasswordSinNumero() {
        ValidadorPassword validador = new ValidadorPassword();
        assertFalse(validador.esValida("Claveaaa"));
    }
}
