public class Main {
    public static void main(String[] args) {
        Gela gela = new Gela();
        gela.hasieratu();

        Thread irakaslea = new Thread(new Irakaslea(gela));
        irakaslea.start();
    }
}
