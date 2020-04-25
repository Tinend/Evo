package org.brodowsky.jungs.evo;

public class Tier {
    private final int groesse;
    private int energie;

    public Tier(int groesse, int energie) {
        this.groesse = groesse;
        this.energie = energie;
    }

    public Tier kindZeugen() {
        int energieVerlust = this.energie / 2;
        this.energie -= energieVerlust;
        return new Tier(groesse, energieVerlust);
    }

    public int getEnergie() {
        return energie;
    }
}
