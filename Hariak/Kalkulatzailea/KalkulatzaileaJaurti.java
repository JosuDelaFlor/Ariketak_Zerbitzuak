package Hariak;

import java.util.ArrayList;

public class KalkulatzaileaJaurti {
    public static void main(String[] args) throws InterruptedException {
        Runnable hariBek[] = new Kalkulatzailea[5];
        ArrayList<Thread> semeHariak = new ArrayList<Thread>();
        for (int i = 0; i < hariBek.length; i++) {
            hariBek[i] = new Kalkulatzailea();
            Thread haria = new Thread(hariBek[i]);
            haria.setName(i + "_haria"); // haria izendatzea
            semeHariak.add(haria);
        }

        for (int i = 0; i < semeHariak.size(); i++) {
            semeHariak.get(i).start();
        }
        System.out.println("KalkulatzaileaJaurti BUKATUTA.");
    }
}
