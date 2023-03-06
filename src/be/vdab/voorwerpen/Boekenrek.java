package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

public class Boekenrek implements Voorwerp {
    private int hoogte;
    private int breedte;
    private float aankoopprijs;
    private static final float WINSTMARGE = 2.0F;

    public Boekenrek() {
        this (175, 100, 40.0F) ; // eenheid in cm
    }

    public Boekenrek(int hoogte, int breedte, float aankoopprijs) {
    setHoogte(hoogte);
    setBreedte(breedte);
    setAankoopprijs(aankoopprijs);
    }

    public int getHoogte() {
        return hoogte;
    }

    public final void setHoogte(int hoogte) {
        if (hoogte > 0){
            this.hoogte = hoogte;
        }
    }

    public int getBreedte() {
        return breedte;
    }

    public final void setBreedte(int breedte) {
        if (breedte > 0) {
            this.breedte = breedte;
        }
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public final void setAankoopprijs(float aankoopprijs) {
        if (aankoopprijs > 0) {
            this.aankoopprijs = aankoopprijs;
        }
    }

    public float getWinstmarge() {
        return WINSTMARGE;
    }
    @Override
    public void gegevensTonen() {
        System.out.println("Gegevens van het boekenrek:");
        System.out.println("Hoogte: " + getHoogte());
        System.out.println("Breedte: " + getBreedte());
        System.out.println("Eigenaar: " + EIGENAAR);
        System.out.println("Aankoopprijs: " + getAankoopprijs());
        System.out.println("Winst: " + winstBerekenen());

    }

    @Override
    public float winstBerekenen() {
        return aankoopprijs * WINSTMARGE;
    }
    @Override
    public String toString() {
        return (hoogte + " ; " + breedte + " ; " + EIGENAAR + " ; " + aankoopprijs + " ; " + WINSTMARGE);
    }
}
