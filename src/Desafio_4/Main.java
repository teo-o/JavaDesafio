package Desafio_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorteo sorteo = new Sorteo();
        int[] numerosElegidos = {1, 2, 3, 4, 5};
        Boleto boleto = new Boleto(numerosElegidos);
        int aciertos = sorteo.compararBoleto(boleto);
        System.out.println("Aciertos: " + aciertos+ " Numero de boleto$: " + Arrays.toString(boleto.getNumeroElegido())+ " Numero de sorteo: " + Arrays.toString(sorteo.getNumerosSorteados()));
    }
}
