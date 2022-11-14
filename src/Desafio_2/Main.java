package Desafio_2;

import java.util.List;

public class Main {

    public static void  main(String[] args) {
        Tablero tablero = new Tablero();
        Ebingo[] letras = Ebingo.values();
        int a=0;
        String tableroString = "";
        for (int i = 0; i < 5; i++) {
            for (List<SerieNumero> serie: tablero.getColumna()) {
                if(i == 2 && a == 12) {
                    tableroString += " X ";
                }
                else {
                    if(i==4 && a == 22 || i==3 && a== 17)
                    {
                        tableroString += (serie.get(i-1) + " ");
                    }
                    else {
                        String numero = serie.get(i)+"";
                        if (Integer.parseInt(numero) < 10) {
                            tableroString += (" " + serie.get(i) + " ");
                        }
                        else
                        {
                            tableroString += (serie.get(i) + " ");
                        }
                    }
                }
                a++;
            }
            tableroString += "\n";
        }
        System.out.println(" "+letras[0] + "  " + letras[1] + "  " + letras[2] + "  " + letras[3] + "  " + letras[4]);
        System.out.println(tableroString);
    }
}
