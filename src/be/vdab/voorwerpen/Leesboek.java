package be.vdab.voorwerpen;

import be.vdab.voorwerpen.Boek;

public class Leesboek extends Boek {
    private String onderwerp;
    private static final float WINSTMARGE = 1.5F;
    public Leesboek() {
        this("Leesboek Java ", "O Reilly", 10.5F, "genre studie", "1234567890123",
                "onderw Informatica" );
    }
    public Leesboek(String titel, String auteur, float aankoopprijs, String genre, String isbn13, String onderwerp) {
        super(titel, auteur, aankoopprijs, genre, isbn13);
        setOnderwerp(onderwerp);
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public final void setOnderwerp(String onderwerp) {
        if (onderwerp != null) {
            this.onderwerp = onderwerp;
        }
    }
    public float getWinstmarge() {
        return WINSTMARGE;
    }
    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Onderwerp: " + onderwerp);
        System.out.println("Winst: " + winstBerekenen());
    }
    @Override
    public float winstBerekenen() {
        return getAankoopprijs() * WINSTMARGE;
    }
    @Override
    public String toString() {
        return super.toString() + " ; " + onderwerp + " ; " + WINSTMARGE;
    }
}
