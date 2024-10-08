package fr.diginamic.maison;

public class WC extends Piece {
    public WC(short nombreEtages, double superficie) {
        super(nombreEtages, superficie);
        this.type = "wc";
    }
}
