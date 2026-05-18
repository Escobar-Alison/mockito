package tp9;

//@Getter
// TODO ARREGLAR LOMBOK PARA ALISON
public class Carta {
    private String  palo;
    private  int valor;

    public Carta(Valor valor, String palo){
        this.valor = valor.getValorNumerico(); //Convierte lo que paso por parametro en un Valor
        this.palo = palo;
    }


    public boolean esSuperiorA(Carta otraCarta) {
        return getValor() > otraCarta.getValor();
    }

    public boolean sonDelMismoPalo(Carta otraCarta) {
        return this.getPalo().equals(otraCarta.getPalo());
        //return c1.getPalo() == c2.getPalo(); //NOOOO, COMPARA si son el MISMO objeto en MEMORIA!!!
    }

    public String getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }
}
