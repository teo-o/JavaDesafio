package Desafio_3;

import java.util.*;

public class Sorteo {
    private static final int MIN =0;
    private static final int MAX = 99999;

    private static final Random RandomNumber = new Random();

    private List<Integer> bomboNumeros = new ArrayList<>();
    private List<EPremio> bomboPremios = new ArrayList<>();
    private Map<Integer, EPremio> TablePremios = new HashMap<>();

    public Sorteo() {
        for(int i = MIN; i <= MAX; i++) {
            bomboNumeros.add(i);
        }
        for (EPremio premio : EPremio.values()) {
            for (int i = 0; i < premio.getCantidadGanadores(); i++) {
                bomboPremios.add(premio);
            }
        }
    }

    public void sortear(){
        while (!bomboNumeros.isEmpty() && !bomboPremios.isEmpty()) {
            int numero = bomboNumeros.remove(RandomNumber.nextInt(bomboNumeros.size()));
            EPremio premio = bomboPremios.remove(RandomNumber.nextInt(bomboPremios.size()));
            TablePremios.put(numero, premio);
        }
    }

    public void printPremios(){
        TablePremios.keySet().stream().sorted().forEach(numero -> System.out.println(numero + " - " + TablePremios.get(numero) + " - " + TablePremios.get(numero).getValorPremioEuro()));
    }
}
