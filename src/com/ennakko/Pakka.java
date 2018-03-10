package com.ennakko;

import java.util.Random;

public class Pakka {

    private final String arvot[] = {"Ässä","2","3","4","5","6","7","8","9","10","Jätkä","Akka","Kurko"};
    private final String maat [] = {"Pata", "Risti","Hertta","Ruutu"};
    private Kortti pakka[];
    private final int koko = 52;
    private Random random;

    public Pakka(){
        pakka = new Kortti[koko];
        random = new Random();

        for (int i = 0; i < pakka.length; i++){
            pakka[i] = new Kortti(arvot[i%13], maat[i/13]);
        }
    }

    public void sekoita(){
        for (int i = 0; i < pakka.length; i++){
            int a = random.nextInt(koko);
            Kortti b = pakka[i];
            pakka[i] = pakka[a];
            pakka[a] = b;
        }
    }

    public Kortti getKortti(int index){
        return pakka[index];
    }
}
