package Desafio_2;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<List<SerieNumero>> columna = new ArrayList<>();

    public Tablero() {
        for(Ebingo letra : Ebingo.values()) {
            List serie = new SerieNumero(letra).createSerie();
            columna.add(serie);
        }
    }

    public List<List<SerieNumero>> getColumna() {
        return columna;
    }
}
