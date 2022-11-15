package Desafio_4;

import java.util.Random;

public class Sorteo {

    private int[] numerosSorteados = new int[5];

    private Random random = new Random();

    public Sorteo() {
        for (int i = 0; i < numerosSorteados.length; i++) {
            numerosSorteados[i] = random.nextInt(10);
            if(validateRepeat(numerosSorteados, i, numerosSorteados[i])){
                i--;
            }
        }
    }

    public int compararBoleto(Boleto boleto) {
        int aciertos = 0;
        int[] numerosElegidos = boleto.getNumeroElegido();
        for (int i = 0; i < numerosElegidos.length; i++) {
            for (int j = 0; j < numerosSorteados.length; j++) {
                if (numerosElegidos[i] == numerosSorteados[j]) {
                    aciertos++;
                }
            }
        }
        return aciertos;
    }

    public boolean validateRepeat(int[] numerosElegidos, int j, int numberTemporal) {
        for (int i = 0; i < j; i++) {
            if(numerosElegidos[i] == numberTemporal) {
                return true;
            }
        }
        return false;
    }

    public int[] getNumerosSorteados() {
        return numerosSorteados;
    }
}
