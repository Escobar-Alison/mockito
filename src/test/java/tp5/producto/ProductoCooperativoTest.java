package tp5.producto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp5.EmpresaImaginaria;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoCooperativoTest {
    ProductoCooperativo pc;
    EmpresaImaginaria   e;

    @BeforeEach
    void setUp() {
        e  = new EmpresaImaginaria();
        pc = new ProductoCooperativo(1300, 13);
    }

    @Test
    void verificacionDelMontoDePago() {
        assertEquals(1170, pc.precioAPagar());
    }
}
