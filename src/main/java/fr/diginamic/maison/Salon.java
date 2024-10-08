package fr.diginamic.maison;

public class Salon extends Piece {
    public Salon(short nombreEtages, double superficie) {
        super(nombreEtages, superficie);
        this.type = "salon";
    }
}
