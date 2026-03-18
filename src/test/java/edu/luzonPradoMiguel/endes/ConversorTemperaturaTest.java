package edu.luzonPradoMiguel.endes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    @Test
    public void testCelsiusAFahrenheit() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(32.0, conversor.celsiusAFahrenheit(0), 0.1);
    }

    @Test
    public void testFahrenheitACelsius() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(0.0, conversor.fahrenheitACelsius(32), 0.1);
    }

    @Test
    public void testCelsiusAFahrenheitOtroValor() {
        ConversorTemperatura conversor = new ConversorTemperatura();
        assertEquals(212.0, conversor.celsiusAFahrenheit(100), 0.1);
    }
}