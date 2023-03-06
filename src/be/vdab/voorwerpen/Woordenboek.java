package be.vdab.voorwerpen;

import be.vdab.voorwerpen.Boek;

public class Woordenboek extends Boek {
    private String taal;
    private static final float WINSTMARGE = 1.75F;
    public Woordenboek() {
        this("Woordenboek Nederlands", "Van Dale", 25.8F,
                "verklarend woordenboek", "9876543210125","taal Nederlands" );
    }
    public Woordenboek(String titel, String auteur, float aankoopprijs, String genre, String isbn13,String taal) {
        super (titel, auteur, aankoopprijs, genre, isbn13);
        setTaal(taal);
    }

    public String getTaal() {
        return taal;
    }

    public void setTaal(String taal) {
        if (taal != null) {
            this.taal = taal;
        }
    }
    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Taal: " + taal);
        System.out.println("Winst: " + winstBerekenen());
    }
    @Override
    public float winstBerekenen() {
        return getAankoopprijs() * WINSTMARGE;
    }
    @Override
    public String toString() {
        return super.toString() + " ; " + taal + " ; " + WINSTMARGE;
    }
}
