package tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp5.factura.FacturaImpuesto;
import tp5.factura.FacturaServicio;
import tp5.producto.ProductoCooperativo;
import tp5.producto.ProductoEmpresa;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CajaTest {
    Caja caja;
    Pagable p1;
    Pagable p2;
    Pagable p3;
    Pagable p4;
    Agencia empresaImaginaria;


    @BeforeEach
    void setUp() {
        empresaImaginaria = new EmpresaImaginaria();
        caja = new Caja();
        p1   = new ProductoEmpresa(1100, 10);                                 // precioAPagar = 1100
        p2   = new ProductoCooperativo(1300, 13);                             // precioAPagar = 1170
        p3   = new FacturaImpuesto(empresaImaginaria, 400);                      // precioAPagar = 400
        p4   = new FacturaServicio(empresaImaginaria, 500, 5); // precioAPagar = 2500

        caja.registrarProducto(p1);
        caja.registrarProducto(p2);
        caja.registrarProducto(p3);
        caja.registrarProducto(p4);
    }

    @Test
    void verificarElMontoAPagarDeLaCaja() {
        assertEquals(5170, caja.montoAPagar());
    }
}