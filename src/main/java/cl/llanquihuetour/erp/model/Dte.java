package cl.llanquihuetour.erp.model;

import cl.llanquihuetour.erp.util.Validador;

import java.time.LocalDate;

/**
 * Representa un documento tributario electrónico (DTE) genérico.
 */
public class Dte {
    private LocalDate fechaEmision;
    private int tipoSii;
    private Rut rutEmisor;
    private String folio;

    public Dte(LocalDate fechaEmision, int tipoSii, Rut rutEmisor, String folio) {
        Validador.noNulo(fechaEmision, "Fecha de emisión");
        Validador.noVacioNulo(folio, "Folio");
        Validador.verificadorRut(rutEmisor, "RUT del emisor");

        this.fechaEmision = fechaEmision;
        this.tipoSii = tipoSii;
        this.rutEmisor = rutEmisor;
        this.folio = folio;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public int getTipoSii() {
        return tipoSii;
    }

    public Rut getRutEmisor() {
        return rutEmisor;
    }

    public String getFolio() {
        return folio;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        Validador.noNulo(fechaEmision, "Fecha de emisión");
        this.fechaEmision = fechaEmision;
    }

    public void setTipoSii(int tipoSii) {
        this.tipoSii = tipoSii;
    }

    public void setRutEmisor(Rut rutEmisor) {
        Validador.noNulo(rutEmisor, "RUT del emisor");
        this.rutEmisor = rutEmisor;
    }

    public void setFolio(String folio) {
        Validador.noVacioNulo(folio, "Folio");
        this.folio = folio;
    }

    @Override
    public String toString() {
        return "Dte{" +
                "fechaEmision=" + fechaEmision +
                ", tipoSii=" + tipoSii +
                ", rutEmisor=" + rutEmisor +
                ", folio='" + folio + '\'' +
                '}';
    }
}