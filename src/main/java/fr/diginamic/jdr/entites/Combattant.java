package fr.diginamic.jdr.entites;

import fr.diginamic.jdr.Tools.GenerationAleatoire;

// classe abstraite : on ne peut pas en créer d'instance
public abstract class Combattant {
    protected String name;
    protected int force;
    protected final int PV_MAX;
    protected int PV;
    protected int score = 0;

    public Combattant(int force, int PV) {
        this.force = force;
        this.PV_MAX = PV;
        this.PV = PV;
    }

    public int calculerAttaque() {
        return this.force + GenerationAleatoire.genererNombreAleatoire(1, 10);
    }

    public void augmenterScore(Creature creature) {
        if (creature instanceof Loup) {
           this.score += 1;
        }
        else if (creature instanceof Gobelin) {
            this.score += 2;
        }
        else {
            this.score += 5;
        }
    }

    public void modifierPV(int diff) {
        this.PV += diff;

        if (this.PV < 0) {
            this.PV = 0;
        }
        else if (this.PV > this.PV_MAX) {
            this.PV = this.PV_MAX;
        }
    }

    public int getForce() {
        return this.force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPV() {
        return this.PV;
    }

    public int getPV_MAX() {
        return this.PV_MAX;
    }

    public int getScore() {
        return this.score;
    }
}
