package ennakko;

import java.util.Arrays;

public class Pelaaja {

    public final static int käsi = 5;
    private Kortti kortit[];

    public Pelaaja(){
        kortit = new Kortti[käsi];
    }

    public Kortti[] getKortit(){
        return kortit;
    }

    public Kortti getKorttiAtIndex(int index){
        if (index >= 0 && index < käsi){
            return kortit[index];
        }else {
            return null;
        }
    }

    public void setKortiAtIndex(Kortti b, int index){
        if (index >= 0 && index < käsi){
            kortit[index] = b;
        }
    }

    public int laskeParit(){
        int summa = 0;
        for (int i = 0; i < kortit.length; i++){
            for (int a = i + 1; a < kortit.length; a++) {
                if (kortit[i].getArvo() == (kortit[a].getArvo())) {
                    summa++;
                }
            }
        }
        return summa;
    }

    public boolean vari(){
        int summa = 0;
        for (int i = 0; i < kortit.length; i++) {
            for (int a = i + 1; a < kortit.length; a++){
                if (kortit[i].getMaa().equals(kortit[a].getMaa())) {
                    summa++;
                }
            }
        }
        if (summa == 5){
            return true;
        }else{
            return false;
        }
    }

    public boolean suora(){

        for (int i = 0; i < kortit.length; i++) {
            if (kortit[i].getArvo() != kortit[i+1].getArvo()) {
                return false;
            }
        }
        return true;
    }
}
