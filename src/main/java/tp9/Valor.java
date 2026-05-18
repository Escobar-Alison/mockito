package tp9;

//enum es una lista de valores válidos
public enum Valor {
    DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), J(11), Q(12), K(13), A(14);
    //Existe un valor del enum llamado DOS y su valor numérico asociado es 2

    private int valorNumerico;

    Valor(int valorNumerico){
        this.valorNumerico = valorNumerico;
    }

    public int getValorNumerico(){
        return valorNumerico;
    }
}
