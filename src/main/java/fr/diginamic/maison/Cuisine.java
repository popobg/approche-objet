package fr.diginamic.maison;

public class Cuisine extends Piece {
    public Cuisine(short nombreEtages, double superficie) {
        super(nombreEtages, superficie);
        this.type = "cuisine";
    }
}
