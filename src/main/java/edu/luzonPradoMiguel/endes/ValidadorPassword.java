package edu.luzonPradoMiguel.endes;

/**
 * Clase que valida contraseñas.
 */
public class ValidadorPassword {

    /**
     * Valida una contraseña.
     * Debe tener al menos 8 caracteres, una mayúscula y un número.
     * @param password contraseña a validar
     * @return true si es válida, false si no lo es
     */
    public boolean esValida(String password) {
        if (password == null) {
            return false;
        }

        if (password.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneNumero = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }

            if (Character.isDigit(c)) {
                tieneNumero = true;
            }
        }

        return tieneMayuscula && tieneNumero;
    }
}