package fr.diginamic.maison;

public class Chambre extends Piece {
    public Chambre(short nombreEtages, double superficie) {
        super(nombreEtages, superficie);
        this.type = "chambre";
    }
}
