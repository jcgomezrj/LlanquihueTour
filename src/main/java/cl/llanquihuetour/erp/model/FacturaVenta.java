package cl.llanquihuetour.erp.model;

import cl.llanquihuetour.erp.util.Validador;

import java.time.LocalDate;

public class FacturaVenta extends Dte {

    private int montoNeto;
    private Rut rutReceptor;

    public FacturaVenta(LocalDate fechaEmision,
                        int tipoSii,
                        Rut rutEmisor,
                        String folio,
                        int montoNeto,
                        Rut rutReceptor) {
        super(fechaEmision, tipoSii, rutEmisor, folio);
        Validador.verificadorRut(rutReceptor, "RUT del receptor");
        this.montoNeto = montoNeto;
        this.rutReceptor = rutReceptor;
    }

    public double getMontoNeto() {
        return montoNeto;
    }

    public Rut getRutReceptor() {
        return rutReceptor;
    }

    public void setMontoNeto(int montoNeto) {
        this.montoNeto = montoNeto;
    }

    public void setRutReceptor(Rut rutReceptor) {
        this.rutReceptor = rutReceptor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFacturaVenta{" +
                "\nmontoNeto=" + montoNeto +
                "\nrutReceptor=" + rutReceptor +
                '}';
    }
}
