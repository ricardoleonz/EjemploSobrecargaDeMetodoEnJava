package constantes;

public enum ParafiscalesEnteros {

    CERO(0),
    NOVIECIENTOS(900000);


    private int enteros;

    ParafiscalesEnteros(int i) {
        this.enteros = i;
    }

    public int getEnteros() {
        return enteros;
    }
}
