package be.vdab.jpfhfdst14;

public class Main {
    public static void main(String[] args) {
        var zwemSeizoen = Seizoen.valueOf("ZOMER");
        System.out.println(zwemSeizoen.ordinal());
        var skiSeizoen = Seizoen.WINTER;
        System.out.println(skiSeizoen.getBeginMaand());
    }
}
