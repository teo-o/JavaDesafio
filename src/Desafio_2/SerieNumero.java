package Desafio_2;

import java.util.Arrays;
import java.util.List;

public class SerieNumero {
    private Ebingo letra;
    private Integer[] numeros;

    public SerieNumero(Ebingo letra) {
        this.letra = letra;
        numeros = new Integer[letra.getLongitud()];
    }

    public List<Integer> createSerie() {
        for (int i = 0; i < numeros.length; i++) {
            int temporal = (int) (Math.random() * (letra.getMax() - letra.getMin() + 1) + letra.getMin());
            Integer temporalInteger = temporal;
            if (validateSerialRepeat(temporalInteger, numeros)) {
                numeros[i] = temporalInteger;
            } else {
                i--;
            }
        }
        return Arrays.asList((numeros));
    }

    public boolean validateSerialRepeat(Integer temp, Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (temp == array[i]) {
                return false;
            }
        }
        return true;
    }

    public Ebingo getLetra() {
        return letra;
    }

}

