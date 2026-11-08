package cl.llanquihuetour.erp.util;

import cl.llanquihuetour.erp.model.Rut;

/**
 * Métodos de validación de variables para uso general. No debe ser instanciada.
 */
public final class Validador {

    /**
     * Verifica que el string no sea null ni tampoco esté vacío.
     * @param campo La variable a verificar.
     * @param nombreCampo El nombre amigable de la variable.
     * @throws IllegalArgumentException
     */
    public static void noVacioNulo(String campo, String nombreCampo) throws IllegalArgumentException {
        if (campo == null || campo.isBlank()) {
            throw new IllegalArgumentException("El campo \"" + nombreCampo + "\" no puede estar vacío o ser nulo.");
        }
    }

    /**
     * Verifica que el string no esté vacío, pudiendo ser null.
     * @param campo La variable a verificar.
     * @param nombreCampo El nombre amigable de la variable.
     * @throws IllegalArgumentException
     */
    public static void noVacio(String campo, String nombreCampo) throws IllegalArgumentException {
        if (campo != null && campo.isBlank()) {
            throw new IllegalArgumentException("El campo \"" + nombreCampo + "\" no puede estar vacío.");
        }
    }

    /**
     * Verifica que el string no sea null.
     * @param campo La variable a verificar.
     * @param nombreCampo El nombre amigable de la variable.
     * @throws IllegalArgumentException
     */
    public static void noNulo(String campo, String nombreCampo) throws IllegalArgumentException {
        if (campo == null) {
            throw new IllegalArgumentException("El campo \"" + nombreCampo + "\" no puede ser nulo.");
        }
    }

    /**
     * Verifica que el objeto no sea null.
     * @param campo El objeto a verificar.
     * @param nombreCampo El nombre amigable del objeto.
     * @throws IllegalArgumentException
     */
    public static void noNulo(Object campo, String nombreCampo) throws IllegalArgumentException {
        if (campo == null) {
            throw new IllegalArgumentException("El objeto \"" + nombreCampo + "\" no puede ser nulo.");
        }
    }

    /**
     * Valida matemáticamente el RUT chileno de acuerdo al algoritmo del módulo 11.
     * @param cuerpo Parte numérica anterior al guión.
     * @param verificador Dígito o letra K posterior al guión.
     * @param nombreCampo Nombre amigable de la variable.
     * @throws IllegalArgumentException
     */
    public static void verificadorRUT(int cuerpo, char verificador, String nombreCampo) throws IllegalArgumentException {
        int acumulado = 0;
        int[] multiplicadores = {2, 3, 4, 5, 6, 7, 2, 3, 4, 5};
        char verificadorCalculado = ' ';

        // Iterar el cuerpo del RUT multiplicando cada dígito.
        for (int multiplicador : multiplicadores) {
            if (cuerpo > 0) {
                int digito = cuerpo % 10;
                acumulado += digito * multiplicador;
                cuerpo = cuerpo / 10;
            }
        }

        // Determinar verificador correcto.
        acumulado = 11 - (acumulado % 11);
        if (acumulado == 11) {
            verificadorCalculado = '0';
        } else if (acumulado == 10) {
            verificadorCalculado = 'K';
        } else {
            verificadorCalculado = (char) (acumulado + '0');
        }

        // Comparar chars verificadores
        if (Character.toLowerCase(verificador) != Character.toLowerCase(verificadorCalculado)) {
            throw new IllegalArgumentException("El campo '"+ nombreCampo + "' es inválido.");
        }
    }

    /**
     * Valida matemáticamente el RUT chileno de acuerdo al algoritmo del módulo 11.
     * @param rut Objeto que contiene el RUT.
     * @param nombreCampo Nombre amigable de la variable.
     * @throws IllegalArgumentException
     */
    public static void verificadorRut(Rut rut, String nombreCampo) throws IllegalArgumentException {
        verificadorRUT(rut.getCuerpo(), rut.getVerificador(), nombreCampo);
    }
}