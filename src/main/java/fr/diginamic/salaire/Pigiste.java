package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    private int nbJoursTravaillesParMois;
    private double remunerationJournaliere;

    public Pigiste(String nom, String prenom, int nbJoursTravailles, double remunerationJournaliere) {
        super(nom, prenom);
        this.nbJoursTravaillesParMois = nbJoursTravailles;
        this.remunerationJournaliere = remunerationJournaliere;
    }

    @Override
    public double getSalaire() {
        return this.nbJoursTravaillesParMois * this.remunerationJournaliere;
    }

    @Override
    public String getStatut() {
        return "PIGISTE";
    }
}
