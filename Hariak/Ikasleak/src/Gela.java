import java.util.Random;

public class Gela {
    private Thread[] hariak = new Thread[10];
    private String[] izenak = {"Ane", "Jon", "Miren", "Unai", "Amaia", "Iker", "Oihane", "Aitor", "Lorea", "Ander"};

    public Gela() {
        Random random = new Random();
        for (int i = 0; i < hariak.length; i++) {
            int count = 5 + random.nextInt(6);
            hariak[i] = new Thread(new Ikaslea(izenak[i], count));
        }
    }

    public void hasieratu() {
        for (Thread thread : hariak) {
            thread.start();
        }
    }

    public void gelditu() {
        for (Thread thread : hariak) {
            thread.interrupt();
        }
    }

    public Thread[] getHariak() { return hariak; }
}
