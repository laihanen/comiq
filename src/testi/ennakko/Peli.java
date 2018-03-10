package testi.ennakko;

import java.util.Scanner;

public class Peli {
    private Pakka pakka;
    private Pelaaja[] pelaajat;

    public Peli(){
        Scanner input = new Scanner(System.in);
        pakka = new Pakka();

        int check;

        do {
            System.out.print("Anna pelaajien lukumäärä (2-6): ");
            int maara = input.nextInt();

            if (maara >= 2 && maara <= 6){
                pelaajat = new Pelaaja[maara];
                for(int i = 0; i<maara; i++) {
                    pelaajat[i] = new Pelaaja();
                }
                check = 0;
            } else {
                System.out.println("Pelaaja määrän on oltava 2-6");
                check = 1;
            }
        } while (check !=0);

        pakka.sekoita();
    }

    public void jaaKortit(){
        int summa = 0;
        for (int i = 0; i < pelaajat[0].getKortit().length; i++){
            for (int a = 0; a < pelaajat.length; a ++){
                pelaajat[a].setKortiAtIndex(pakka.getKortti(summa++), i);
            }
        }
    }

    public void naytaKortit(){
        for (int i = 0; i < pelaajat.length; i++){
            System.out.print("Pelaajalla " + (i + 1) + " on : ");
            for (int a = 0; a < pelaajat[0].getKortit().length; a++){
                System.out.print(pelaajat[i].getKorttiAtIndex(a).toString());
            }
            if (pelaajat[i].laskeParit() > 0 && pelaajat[i].laskeParit() < 3){
                System.out.print("\nPari(a):" + pelaajat[i].laskeParit()+ "! ");
            }

            if (pelaajat[i].laskeParit() == 3){
                System.out.print("\nKolmoset!");
            }

            if (pelaajat[i].laskeParit() == 4){
                System.out.print("\nNeloset!");
            }

            if (pelaajat[i].vari()){
                System.out.print("Väri\n");
            }
            if (pelaajat[i].suora()){
                System.out.print("Suora\n");
            }
            if (pelaajat[i].varisuora()){
                System.out.print("Värisuora\n");
            }
            System.out.println("\n------------------------------------");
        }
    }
}
