package be.vdab.jpfhfdst12;

public class Kopieermachines implements Kost {
    private final String merk;
    private final double kostPerBlz;
    private final int aantalBlz;

    public Kopieermachines(String merk, double kostPerBlz, int aantalBlz) {
        this.merk = merk;
        this.kostPerBlz = kostPerBlz;
        this.aantalBlz = aantalBlz;
    }

    @Override
    public double bedragKost() {
        return kostPerBlz * aantalBlz;
    }

    @Override
    public boolean personeelsKost() {
        return false;
    }
    public String getMerk() {
        return merk;
    }
    public int getAantalBlz() {
        return aantalBlz;
    }
}
