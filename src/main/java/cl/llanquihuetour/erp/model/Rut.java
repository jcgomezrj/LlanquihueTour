package cl.llanquihuetour.erp.model;

import cl.llanquihuetour.erp.util.Validador;

/**
 * Representa el RUT de una persona natural o jurídica.
 */
public class Rut {
    /**
     * Es la parte numérica anterior al guión.
     */
    private int cuerpo;

    /**
     * Es el dígito o letra K que va después del guión.
     */
    private char verificador;

    public Rut(int cuerpo, char verificador) {
        Validador.verificadorRUT(cuerpo, verificador, "RUT");
        this.cuerpo = cuerpo;
        this.verificador = verificador;
    }

    public int getCuerpo() {
        return cuerpo;
    }

    public char getVerificador() {
        return verificador;
    }

    public void setCuerpo(int cuerpo) {
        Validador.verificadorRUT(cuerpo, verificador, "RUT");
        this.cuerpo = cuerpo;
    }

    public void setVerificador(char verificador) {
        Validador.verificadorRUT(cuerpo, verificador, "RUT");
        this.verificador = verificador;
    }

    @Override
    public String toString() {
        return "Rut: " + cuerpo + '-' + verificador;
    }
}
