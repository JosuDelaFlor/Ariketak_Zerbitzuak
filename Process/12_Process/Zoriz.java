import java.util.Random;
import java.util.Scanner;

public class Zoriz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        while (in.hasNextLine()) {
            String input = in.nextLine();

            if (input.equalsIgnoreCase("buka")) {
                break;
            }
            int rn = r.nextInt(11);
            System.out.println(rn);
            System.out.flush();
        }
        in.close();
    }
}
