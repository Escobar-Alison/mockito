package tp5.factura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp5.EmpresaImaginaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturaServicioTest {
    FacturaServicio   fs;
    EmpresaImaginaria e;

    @BeforeEach
    void setUp() {
        e  = new EmpresaImaginaria();
        fs = new FacturaServicio(e, 500, 5);
    }

    @Test
    void verificacionDelMontoDePagp() {
        assertEquals(2500, fs.precioAPagar());
    }
}
