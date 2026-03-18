package edu.luzonPradoMiguel.endes;

/**
 * Clase que convierte temperaturas entre Celsius y Fahrenheit.
 */
public class ConversorTemperatura {

    /**
     * Convierte de Celsius a Fahrenheit.
     * @param celsius grados Celsius
     * @return grados Fahrenheit
     */
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Convierte de Fahrenheit a Celsius.
     * @param fahrenheit grados Fahrenheit
     * @return grados Celsius
     */
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
