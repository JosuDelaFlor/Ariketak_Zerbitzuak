package Hariak;

public class Kalkulatzailea implements Runnable {
    @Override
    public void run() {
        Thread haria = Thread.currentThread();
        String izena = haria.getName();
        int kont = 0;
        while (kont < 5) {
            System.out.println(izena + " kalkulatzen...");
            try {
                long denb = (long) (1000 * Math.random() * 10);
                if (denb > 6000) {
                    denb = 6000;
                }
                Thread.sleep(denb); // HEMEN sartu 2000 denb ordez
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(izena + " kalkulatzen eta berrabiarazten.");
            kont++;
        }
        System.out.println(izena + " BUKATUTA.");
    }
}