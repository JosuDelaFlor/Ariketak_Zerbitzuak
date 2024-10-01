package Runtime;

import java.io.IOException;

public class BatuketaJaurti {
	/**
	 * Prozesua Runtime Erabilita
	 * @param args
	 */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
		System.out.println("BatuketaJaurtiMain: BatuketaMain prozesua SORTU dut.");
		try {
			Process p = runtime.exec(new String[]{"java", "bin\\Batuketa", "13", "13"});
			System.out.println("BatuketaJaurtiMain: BatuketaMain prozesua JAURTI dut.");
			p.waitFor();
			System.out.println("BatuketaJaurtiMain: BatuketaMain prozesua BUKATU da.");
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("BatuketaJaurtiMain: Banoa lotara.");
    }
}
