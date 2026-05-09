package tp5.factura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp5.EmpresaImaginaria;

import static org.mockito.Mockito.*;

public class FacturaImpuestoTest {
    FacturaImpuesto   fi;
    EmpresaImaginaria e;

    @BeforeEach
    void setUp(){
        e  = mock(EmpresaImaginaria.class);
        fi = new FacturaImpuesto(e, 400);
    }


    @Test
    void verificacionDelPrecioAPagar() {
        //when(e.registrarPago(fi)).thenReturn(); para los que tienen un retorno
        // orden; mock, time(cantComprobar).metodo()
        e.registrarPago(fi);
        verify(e, times(1)).registrarPago(fi);

        //assertEquals(400, fi.precioAPagar());
    }
}
