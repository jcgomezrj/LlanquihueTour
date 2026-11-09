package cl.llanquihuetour.erp.app;

import cl.llanquihuetour.erp.model.Direccion;
import cl.llanquihuetour.erp.model.Rut;
import cl.llanquihuetour.erp.util.Validador;

public class Main {
    public static void main(String[] args) {

        // Crear Direccion con argumento vacío para provocar excepción.
        System.out.println("Creando objeto Direccion con error:");
        try {
            Direccion direccionErronea = new Direccion(
                    "Los Jazmines",
                    368,
                    null,
                    "",
                    "RM",
                    "Chile");
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }

        //


    }
}
