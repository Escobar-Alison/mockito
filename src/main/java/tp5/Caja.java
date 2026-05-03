package tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
    private List<Pagable> pagables = new ArrayList<>();

    public void registrarProducto(Pagable p){
        pagables.add(p);
        p.registrarPago();
    }

    public double montoAPagar() {
        return pagables.stream().mapToDouble(p -> p.precioAPagar()).sum();
    }
}
