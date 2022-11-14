package Desafio_3;

public enum EPremio {
    PEDREA(5, 18), QUINTO(8, 300), CUARTO(2, 1000), TERCERO(1,2500), SEGUNDO(1,6250 ), GORDO(1,20000);
    private float valorPremioEuro;
    private int cantidadGanadores;

    EPremio(int cantidadGanadores, float valorPremio) {
        this.cantidadGanadores = cantidadGanadores;
        this.valorPremioEuro = valorPremio;
    }

    public float getValorPremioEuro() {
        return valorPremioEuro;
    }

    public int getCantidadGanadores() {
        return cantidadGanadores;
    }
}
