package tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp5.factura.FacturaImpuesto;
import tp5.factura.FacturaServicio;
import tp5.producto.ProductoCooperativo;
import tp5.producto.ProductoEmpresa;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpresaImaginariaTest {
    EmpresaImaginaria empresa;

    @BeforeEach
    void setUp() {
        empresa    = new EmpresaImaginaria();
        Caja  caja = new Caja();
        Pagable p1 = new ProductoEmpresa(1100, 10);                                 // precioAPagar = 1100
        Pagable p2 = new ProductoCooperativo(1300, 13);                             // precioAPagar = 1170
        Pagable p3 = new FacturaImpuesto(empresa, 400);                      // precioAPagar = 400
        Pagable p4 = new FacturaServicio(empresa, 500, 5); // precioAPagar = 2500

        caja.registrarProducto(p1);
        caja.registrarProducto(p2);
        caja.registrarProducto(p3);
        caja.registrarProducto(p4);
    }

    @Test
    void verifiacionRegistroCorrectoDelPagoDeUnaFactura() {
        assertEquals(2, empresa.getPagosRegistrados());
    }
}
