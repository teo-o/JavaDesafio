package Desafio_4;

public class Boleto {
    private int[] numeroElegido = new int[5];
    public Boleto(int[] numeroElegido) {
        this.numeroElegido = numeroElegido;
    }

    public int[] getNumeroElegido() {
        return numeroElegido;
    }
}
