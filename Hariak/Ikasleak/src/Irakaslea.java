public class Irakaslea implements Runnable {
    private Gela gela;

    public Irakaslea(Gela gela) {
        this.gela = gela;
    }

    @Override
    public void run() {
        System.out.println("Kaixo");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            return;
        }

        gela.gelditu();
    }
}
