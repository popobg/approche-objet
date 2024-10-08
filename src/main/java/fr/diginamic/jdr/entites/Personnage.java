package fr.diginamic.jdr.entites;

public class Personnage extends Combattant {

    public Personnage(int force, String name, int PV) {
        super(force, PV);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Je suis " + name +
                " ! J'ai actuellement " +
                PV + " points de santé, et je suis preux.";
    }
}
