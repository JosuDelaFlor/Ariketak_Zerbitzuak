import java.util.Random;

public class Ikaslea implements Runnable {
    private String izena;
    private int count;
    private String[] agurrak = {"kaixo!", "eup!", "zelan?", "eeeepa!", "faktos!"};

    public Ikaslea(String izena, int count) {
        this.izena = izena;
        this.count = count;
    }

    //#region Getters&Setters

    public String getIzena() { return izena; }

    public int getCount() { return count; }

    public String[] getAgurrak() { return agurrak; }

    //#endregion

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int index = random.nextInt(agurrak.length);
            System.out.println("Izena: " + izena + "Agurra: " + agurrak[index]);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
