package tp9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*DATOS DE CARTAS*/
//P = picas, C = corazones, D = diamantes, T = tréboles
//1 al 10 + J, Q y K
//SOLO HAY UN MASO

public class PokerStatus {
    //private List<String> conjuntoCartas;

    public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
        List<Carta> cartas = Arrays.asList(c1, c2, c3, c4, c5);

        if (this.esPoker(cartas)) {
            return "Poquer";
        }
        if (this.esColor(cartas)) {
            return "Color";
        }
        if (this.esTrio(cartas)) {
            return "Trio";
        }
        return "Sin jugada";
    }

    //POKER; 4 de igual valor (nro)
    public boolean esPoker(List<Carta> cartas) {
        List<Double>      valores    = this.obtenerValores(cartas);
        Map<Double, Long> cantidades = this.contarRepetidas(valores);

        return this.tieneCantidad(cantidades, 4);
    }

    //COLOR; 5 del mismo color/palo
    public boolean esColor(List<Carta> cartas) {
        List<String>      palos      = this.obtenerPalos(cartas);
        Map<String, Long> cantidades = this.contarRepetidas(palos);

        return this.tieneCantidad(cantidades, 5);
    }

    //TRIO; 3 de mismo valor (nro)
    public boolean esTrio(List<Carta> cartas) {
        List<Double>      valores    = this.obtenerValores(cartas);
        Map<Double, Long> cantidades = this.contarRepetidas(valores);

        return this.tieneCantidad(cantidades, 3);
    }

    private List<String> obtenerPalos(List<Carta> cartas) {
        return cartas.stream().map(Carta::getPalo).toList();
    }

    private List<Double> obtenerValores(List<Carta> cartas) {
        return cartas.stream().mapToDouble(carta -> (double) carta.getValor()).boxed().toList();
    }

    //NUEVO TEMA, tipo polimorfico
    private <T> Map<T, Long> contarRepetidas(List<T> nrosCartas) {
        return nrosCartas.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );
    }

    private <T> boolean tieneCantidad(Map<T, Long> cant, int nro) {
        return cant.values()
                .stream()
                .anyMatch(c -> c >= nro);
    }

}


/*
    public boolean verificar(String c1, String c2, String c3, String c4, String c5){
        List<String> cartas = Arrays.asList(c1, c2, c3, c4, c5); //Mejor forma, en vez de poner .add()

        //Se convierte la lista en stream, lo cual hace que Java procese cada carta una por una
        return cartas.stream()
                    //Se transformando cada carta
                    .map( carta -> carta.substring(0, carta.length()-1))
                    //Guarda todo en una lista;
                    //y el Collectors.groupingBy es una forma especial de recolectar, en este caso, agrupa elementos similares
                    .collect(Collectors.groupingBy(
                        //Usá el propio elemento como clave
                        Function.identity(),
                        //Hasta este momento quedá "10" -> ["10", "10"], "7"  -> ["7", "7", "7"]
                        //Entonces en vez de guardar la lista, guardá cuántos hay
                        Collectors.counting()
                    ))
                    //Se obtine los valores, es decir, la cantidad; [2, 3...]
                    .values()
                    .stream()
                    .anyMatch(c -> c >= 4);
    }
*/



/*
    public String verificar(String c1, String c2, String c3, String c4, String c5) {
        List<String> cartas = Arrays.asList(c1, c2, c3, c4, c5);

        if (this.esPoker(cartas)) {
            return "Poquer";
        }
        if (this.esColor(cartas)) {
            return "Color";
        }
        if (this.esTrio(cartas)) {
            return "Trio";
        }
        return "Sin jugada";
    }

    //POKER; 4 de igual valor (nro)
    public boolean esPoker(List<String> cartas) {
        List<String>      valores    = this.obtenerValores(cartas);
        Map<String, Long> cantidades = this.contarRepetidas(valores);

        return this.tieneCantidad(cantidades, 4);
    }

    //COLOR; 5 del mismo color/palo
    public boolean esColor(List<String> cartas) {
        List<String>      palos      = this.obtenerPalos(cartas);
        Map<String, Long> cantidades = this.contarRepetidas(palos);

        return this.tieneCantidad(cantidades, 5);
    }

    //TRIO; 3 de mismo valor (nro)
    public boolean esTrio(List<String> cartas) {
        List<String>      valores    = this.obtenerValores(cartas);
        Map<String, Long> cantidades = this.contarRepetidas(valores);

        return this.tieneCantidad(cantidades, 3);
    }

    private List<String> transformarCartas(List<String> cartas, Function<String, String> transformacion) {
                                                            //lit es una función String carta -> String carta
        return cartas.stream()
                .map(transformacion)
                .toList();
    }

    private List<String> obtenerPalos(List<String> cartas) {
        return this.transformarCartas(cartas, carta -> carta.substring(carta.length()-1));
    }

    private List<String> obtenerValores(List<String> cartas) {
        return this.transformarCartas(cartas, carta -> carta.substring(0, carta.length()-1));
    }

    private Map<String, Long> contarRepetidas(List<String> nrosCartas) {
        return nrosCartas.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );
    }

    private boolean tieneCantidad(Map<String, Long> cant, int nro) {
        return cant.values().stream().anyMatch(c -> c >= nro);
    }
*/

