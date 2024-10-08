package fr.diginamic.maison;

public abstract class Piece {
    protected double superficie;
    // 0 = RDC
    protected short nombreEtages;

    public Piece(short nombreEtages, double superficie) {
        this.nombreEtages = nombreEtages;
        this.superficie = superficie;
    }

    public short getNombreEtages() {
        return nombreEtages;
    }

    public void setNombreEtages(short nombreEtages) {
        this.nombreEtages = nombreEtages;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public abstract String getType();
}
