package be.vdab;

import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.voorwerpen.Woordenboek;

public class VoorwerpenMain {
    public static void main(String[] args) {
        var voorwerpen = new Voorwerp[6];
        voorwerpen[0] = new Boekenrek();
        voorwerpen[1] = new Boekenrek(50, 100, 15F);
        voorwerpen[2] = new Leesboek();
        voorwerpen[3] = new Leesboek("OrDieTrying", "Wick", 13.75F, "Selfhelp", "978-0-306-40615-7","JohnWick");
        voorwerpen[4] = new Woordenboek();
        voorwerpen[5] = new Woordenboek("Engels", "James", 4.95F, "Woordenboek", "85-201479-632-15","Engels");

        var totaleWinst = 0.0F;

        for (var voorwerp : voorwerpen) {
            voorwerp.gegevensTonen();
            System.out.println();
            voorwerp.winstBerekenen();
            totaleWinst += voorwerp.winstBerekenen();
        }
        System.out.println("De totale winst bedraagt " + totaleWinst);
    }
}
