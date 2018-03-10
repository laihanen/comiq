package com.ennakko;

public class Kortti {
    private String arvo;
    private String maa;

    public Kortti(String arvo, String maa) {
        super();
        this.arvo = arvo;
        this.maa = maa;
    }

    public String getArvo() {
        return arvo;
    }

    public String getMaa() {
        return maa;
    }

    public String toString() {
        return maa + " " + arvo +", ";
    }
}