package tp5.factura;

import tp5.Agencia;

public class FacturaServicio extends Factura {
    private double costoPorUnidad;
    private int    cantDeUdConsumidas;

    public FacturaServicio(Agencia agencia, double costoPorUnidad, int cantDeUdConsumidas) {
        super(agencia);
        this.costoPorUnidad     = costoPorUnidad;
        this.cantDeUdConsumidas = cantDeUdConsumidas;
    }

    @Override
    public double precioAPagar() {
        return this.getCostoPorUnidad() * this.getcantDeUdConsumidas();
    }

    public int    getcantDeUdConsumidas() { return cantDeUdConsumidas; }
    public double getCostoPorUnidad()     { return costoPorUnidad; }
}
