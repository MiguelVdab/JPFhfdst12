package be.vdab.taakEnum;

public class Persoon {
    private String voornaam;
    private String familienaam;
    private Geslacht geslacht;

    public Persoon() {
    }

    public Persoon(String voornaam, String familienaam, Geslacht geslacht) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.geslacht = geslacht;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        if (voornaam != null) {
            this.voornaam = voornaam;
        }
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public void setFamilienaam(String familienaam) {
        if (familienaam != null) {
            this.familienaam = familienaam;
        }
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(Geslacht geslacht) {
        if (geslacht != null) {
            this.geslacht = geslacht;
        }
    }
    @Override
    public String toString() {
        return voornaam + " ; " + familienaam + " : " + geslacht;
    }
}
