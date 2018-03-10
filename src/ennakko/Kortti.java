package ennakko;

public class Kortti {
    private int arvo;
    private String maa;

    public Kortti(int arvo, String maa) {
        super();
        this.arvo = arvo;
        this.maa = maa;
    }

    public int getArvo() {
        return arvo;
    }

    public String getMaa() {
        return maa;
    }

    public String toString() {
        return maa + " " + arvo +", ";
    }
}