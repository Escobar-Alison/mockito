package tp5;

import tp5.factura.Factura;

public class EmpresaImaginaria implements Agencia {
    private int pagosRegistrados;

    @Override
    public void registrarPago(Factura f) {
        pagosRegistrados += 1;
    }

    public int getPagosRegistrados() { return pagosRegistrados; }
}