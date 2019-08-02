package constantes;

public enum ParafiscalesDouble {

    DOSPORCIENTO(0.02),
    TRESPORCIENTO(0.03),
    CUATROPORCIENTO(0.04),
    CINCOPORCIENTO(0.05);

    private double dobles;

    ParafiscalesDouble(double v) {
        this.dobles = v;
    }

    public double getDobles() {
        return dobles;
    }
}
