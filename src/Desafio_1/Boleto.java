package Desafio_1;

import java.util.Arrays;

public class Boleto {
    private Serial serial;
    private Persona persona;
    public Boleto(Persona persona) {
        this.serial = new Serial();
        this.persona = persona;
    }
    public Serial getSerial() {
        return serial;
    }
}
