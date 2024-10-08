package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int nbClientsInscrits;
    private double recetteTotale;

    public Theatre(String nom, int nbClientsInscrits, int capaciteMax, double recetteTotale) {
        this.recetteTotale = recetteTotale;
        this.nom = nom;
        this.nbClientsInscrits = nbClientsInscrits;
        this.capaciteMax = capaciteMax;
    }

    /**
     * Ajoute les clients donnés aux clients inscrits
     * tant que le théâtre n'est pas rempli, c'est-à-dire tant que
     * la capacité max est supérieure au nombre de clients inscrits
     * @param nbClientsAInscrire nombre de clients qui souhaitent s'inscrire
     * @param prixPlace prix de la place pour cette représentation
     * @return "true" si tous les clients donnés ont pu être inscrits,
     *          "false" si tous les clients n'ont pas pu être inscrits
     *          (plus de place)
     */
    public boolean InscrireClients(int nbClientsAInscrire, double prixPlace) {
        while (this.capaciteMax > nbClientsInscrits && nbClientsAInscrire > 0) {
            this.nbClientsInscrits += 1;
            nbClientsAInscrire -= 1;

            // On encaisse le client
            this.setRecetteTotale(this.recetteTotale + prixPlace);
        }

        // le message de capacité max peut s'afficher même si tous les spectateurs
        // donnés en paramètre ont été placés, c'est-à-dire s'il y a pile
        // le bon nombre de places
        if (this.capaciteMax == nbClientsInscrits) {
            this.afficherMessageErreur("Le théâtre n'accueille plus de spectateur.");
        }
        
        return nbClientsAInscrire == 0;
    }

    private void afficherMessageErreur(String message) {
        System.out.println(message);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int nouvelleCapacite) {
        this.capaciteMax = nouvelleCapacite;
    }

    public int getNbClientsInscrits() {
        return nbClientsInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }

    public void setRecetteTotale(double nouvelleRecette) {
        this.recetteTotale = nouvelleRecette;
    }
}
