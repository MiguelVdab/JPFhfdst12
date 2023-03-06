package be.vdab.voorwerpen;

import be.vdab.util.Isbn13Exception;
import be.vdab.util.Voorwerp;

import java.sql.SQLOutput;

public class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopprijs;
    private String genre;
    private String isbn13;

    public Boek(String titel, String auteur, float aankoopprijs, String genre, String isbn13) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopprijs(aankoopprijs);
        setGenre(genre);
        setIsbn13(isbn13);
    }

    public String getTitel() {
        return titel;
    }

    public final void setTitel(String titel) {
        if (titel != null) {
            this.titel = titel;
        }
    }

    public String getAuteur() {
        return auteur;
    }

    public final void setAuteur(String auteur) {
        if (auteur != null) {
            this.auteur = auteur;
        }
    }

    public float getAankoopprijs() {
        return aankoopprijs;
    }

    public void setAankoopprijs(float aankoopprijs) {
        if (aankoopprijs > 0) {
            this.aankoopprijs = aankoopprijs;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre != null) {
            this.genre = genre;
        }
    }

    public String getIsbn13() {
        return isbn13;
    }

    public final void setIsbn13(String isbn13) {
        try {
            if (testIsbn13(isbn13)) {
                this.isbn13 = isbn13;
            } else {
                throw new Isbn13Exception("Laatste cijfer is ongeldig");
            }
        } catch (Isbn13Exception e) {
            System.out.println("Boek titel: " + this.titel + ", heeft een foutief ISBNnummer!");
            this.isbn13 = null;
        }
    }
    private boolean testIsbn13(String isbn13){
        String nummers = isbn13.replace("-", "");
        if (isbn13 == null || isbn13.trim().isEmpty() || nummers.length() != 13) {
            return false;
        }
        int laatsteNum = Integer.parseInt(String.valueOf(nummers.charAt(12)));
        try {
            int som = 0;
            for (var i = 0; i < 12; i++) {
                int num = Integer.parseInt(String.valueOf(nummers.charAt(i)));
                if (i % 2 == 0) {
                    som += num;
                } else {
                    som += num * 3;
                }
            }
            int check = 10 - (som % 10);
            return check == laatsteNum;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    @Override
    public void gegevensTonen() {
        System.out.println("Gegevens van boek: ");
        System.out.println("Isbn13: " + isbn13);
        System.out.println("Titel: " + getTitel());
        System.out.println("Auteur: " + getAuteur());
        System.out.println("Eigenaar: " + EIGENAAR);
        System.out.println("Aankoopprijs: " + getAankoopprijs());
        System.out.println("Genre: " + getGenre());
    }

    @Override
    public float winstBerekenen() {
        return 0;
    }

    @Override
    public String toString() {
        return (isbn13 + " ; " + titel + " ; " + auteur + " ; " + EIGENAAR + " ; " + aankoopprijs + " ; " + genre);
    }
}
