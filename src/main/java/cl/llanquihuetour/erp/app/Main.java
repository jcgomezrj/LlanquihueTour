package cl.llanquihuetour.erp.app;

import cl.llanquihuetour.erp.model.*;

import java.time.LocalDate;

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
            System.out.println(e.getMessage() + "\n");
        }

        // Crear Rut erróneo para provocar excepción.
        System.out.println("Creando objeto Rut con error:");
        try {
            Rut rutErroneo = new Rut(12345678, 'k');
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "\n");
        }

        // Crear PersonaNatural con Rut y Direccion.
        Direccion direccion = new Direccion(
                "Los Girasoles",
                4928,
                null,
                "Ñuñoa",
                "RM",
                "Chile");
        Rut rut = new Rut(12345678, '5');
        PersonaNatural persona = new PersonaNatural(
                "Pepito",
                "Pérez",
                LocalDate.of(1991, 10, 25),
                rut,
                "pepito91@gmail.com",
                "981912345",
                direccion);
        System.out.println("Imprimiendo datos de la persona natural: \n" + persona + "\n");

        // Crear Dte con Rut.
        Dte dte = new Dte(
                LocalDate.of(2026, 11, 2),
                52,
                new Rut(16019943, '1'),
                "FG4834");
        System.out.println("Imprimiendo datos de un DTE:\n" + dte + "\n");

        // Crear FacturaVenta con Rut que hereda de Dte.
        FacturaVenta factura = new FacturaVenta(
                LocalDate.of(2026, 11, 5),
                12,
                new Rut(11111111, '1'),
                "BH1183",
                15000,
                new Rut(16019943, '1'));
        System.out.println("Imprimiendo datos de una factura:\n" + factura);
    }
}
