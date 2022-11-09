package Desafio_1;

import java.util.Arrays;

public class Serial {
    private int[] serialArray;
    private String serial;
    final int serialLength = 5;
    final int MAX = 50;
    final int MIN = 1;

    public Serial() {
        this.serialArray = new int[serialLength];
        this.serial = "";
        this.serialGenerator();
    }
    public void serialGenerator() {
        int temporalRandom;
        for (int i = 0; i < serialLength; i++) {
            temporalRandom = (int) (((MAX-MIN+1)*Math.random())+MIN);
            if(validateSerialRepeat(temporalRandom, serialArray)) {
                serialArray[i] = temporalRandom;
            } else {
                i--;
            }
        }
        Arrays.sort(serialArray);
        for (int i = 0; i < serialLength; i++) {
            serial += serialArray[i];
        }
    }

    public boolean validateSerialRepeat(int temp, int[] serialArray) {
        for (int i = 0; i < serialLength; i++) {
            if(temp == serialArray[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return serial;
    }
}
