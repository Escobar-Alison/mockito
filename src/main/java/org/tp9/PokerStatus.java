package org.tp9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*DATOS DE CARTAS*/
//P = picas, C = corazones, D = diamantes, T = tréboles
//1 al 10 + J, Q y K


public class PokerStatus {
    //private List<String> conjuntoCartas;

    public boolean verificar(String c1, String c2, String c3, String c4, String c5){
        List<String>      cartas     = Arrays.asList(c1, c2, c3, c4, c5);
        List<String>      valores    = this.obtenerValores(cartas); //Solo los numeros
        Map<String, Long> cantidades = this.contarRepetidas(valores);

        return this.tieneCantidad(cantidades, 4);
    }

    private List<String> obtenerValores(List<String> cs) {
        return cs.stream()
                    .map(carta -> carta.substring(0, carta.length()-1))
                    .toList();
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

