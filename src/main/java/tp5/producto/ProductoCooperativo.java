package tp5.producto;

public class ProductoCooperativo extends Producto {

    public ProductoCooperativo(double precioBase, int stock) {
        super(precioBase, stock);
    }

    @Override
    public double precioAPagar() {
        return super.precioAPagar() * 0.9;
    }

}

