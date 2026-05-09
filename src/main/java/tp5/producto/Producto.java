package tp5.producto;

import tp5.Pagable;

public class Producto implements Pagable {
    private double precioBase;
    private int stock;

    public Producto(double precioBase, int stock){
        this.precioBase = precioBase;
        this.stock      = stock;
    }

    public double precioAPagar() { return precioBase; }

    public void registrarPago() {
        stock--;
    }

}
