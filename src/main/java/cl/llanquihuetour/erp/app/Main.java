package cl.llanquihuetour.erp.app;

import cl.llanquihuetour.erp.model.Direccion;
import cl.llanquihuetour.erp.model.Rut;
import cl.llanquihuetour.erp.util.Validador;

public class Main {
    public static void main(String[] args) {

        Direccion direccionErronea = new Direccion(
                "Los Jazmines",
                368,
                null,
                "Ñuñoa",
                "RM",
                "Chile"
        );

    }
}
