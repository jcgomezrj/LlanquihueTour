package cl.llanquihuetour.erp.model;

import cl.llanquihuetour.erp.util.Validador;

/**
 * Representa la dirección postal de una persona natural o jurídica.
 */
public class Direccion {
    private String nombreCalle;
    private int numeroCalle;

    /**
     * Este parámetro puede ser null cuando la dirección no tiene complemento.
     */
    private String complemento;
    private String comuna;
    private String region;
    private String pais;

    public Direccion(String nombreCalle,
                     int numeroCalle,
                     String complemento,
                     String comuna,
                     String region,
                     String pais) {
        Validador.noVacioNulo(nombreCalle, "Nombre de calle");
        Validador.noVacio(complemento, "Complemento");
        Validador.noVacioNulo(comuna, "Comuna");
        Validador.noVacioNulo(region, "Región");
        Validador.noVacioNulo(pais, "País");

        this.nombreCalle = nombreCalle;
        this.numeroCalle = numeroCalle;
        this.complemento = complemento;
        this.comuna = comuna;
        this.region = region;
        this.pais = pais;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getComuna() {
        return comuna;
    }

    public String getRegion() {
        return region;
    }

    public String getPais() {
        return pais;
    }

    public void setNombreCalle(String nombreCalle) {
        Validador.noVacioNulo(nombreCalle, "Nombre de calle");
        this.nombreCalle = nombreCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    public void setComplemento(String complemento) {
        Validador.noVacio(complemento, "Complemento");
        this.complemento = complemento;
    }

    public void setComuna(String comuna) {
        Validador.noVacioNulo(comuna, "Comuna");
        this.comuna = comuna;
    }

    public void setRegion(String region) {
        Validador.noVacioNulo(region, "Region");
        this.region = region;
    }

    public void setPais(String pais) {
        Validador.noVacioNulo(pais, "País");
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "nombreCalle='" + nombreCalle + '\'' +
                ", numeroCalle=" + numeroCalle +
                ", complemento='" + complemento + '\'' +
                ", comuna='" + comuna + '\'' +
                ", region='" + region + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}