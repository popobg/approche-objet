package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxRemuneration;

    public CompteTaux(String numeroCompte, double soldeCompte, double tauxRemuneration) {
        super(numeroCompte, soldeCompte);
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
