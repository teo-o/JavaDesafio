package Desafio_2;

public enum Ebingo {
    B(1,15, 5), I(16, 30, 5), N(34, 45, 4), G(46,60, 5), O(61,75, 5);
    private int max;
    private int min;
    private int longitud;

    Ebingo(int min, int max, int longitud) {
        this.min = min;
        this.max = max;
        this.longitud = longitud;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}
