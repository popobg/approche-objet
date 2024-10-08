package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxRemuneration;

    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {
        super(numeroCompte, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        String str = super.toString();
        // On retire le } présent à la fin du toString par défaut
        return str.substring(0, (str.length() - 1)) + ", tauxRemuneration=" + tauxRemuneration +
                '}';
    }
}
