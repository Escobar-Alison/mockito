package tp5.factura;

import tp5.Agencia;
import tp5.Pagable;

public abstract class Factura implements Pagable {
    Agencia agencia;

    public Factura(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public void registrarPago(){
        agencia.registrarPago(this);
    }

    public abstract double precioAPagar();
}
