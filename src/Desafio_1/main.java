package Desafio_1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona persona = new Persona("Juan", "Perez", "12345678", "Calle falsa 123", "123456789", "juan@gmail.com");
        int cntBoletos = sc.nextInt();
        System.out.println("Boletos para: " + persona + " Cantidad: " + cntBoletos);
        for (int i = 0; i < cntBoletos; i++) {
            Boleto boleto = new Boleto(persona);
            System.out.println(boleto.getSerial());
        }
    }
}
