package be.vdab.jpfhfdst12;

public interface Afschrijving {
    int termijn(); //is impliciet public abstract
    double jaarlijksBedrag(); //idem
    default int tienjaarstermijn() {
        return 10;
    }
    static void beschrijving() {
        System.out.println("Een investering of aankoop verdelen over " +
                "bepaalde termijn.");
    }
}
