package tp5.factura;

import tp5.Agencia;

public class FacturaImpuesto extends Factura {
    private double tasaDelServicio;

    public FacturaImpuesto(Agencia agencia, double tasaDelServicio) {
        super(agencia);
        this.tasaDelServicio = tasaDelServicio;
    }

    public double precioAPagar() {
        return this.getTasaDelServicio();
    }

    public double getTasaDelServicio() { return tasaDelServicio; }

}