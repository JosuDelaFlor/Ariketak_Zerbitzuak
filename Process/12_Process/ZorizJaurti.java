import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZorizJaurti {
    public static void main(String[] args) {
        try {
            // Process
            ProcessBuilder processBuilder = new ProcessBuilder("java", "Zoriz");
            Process process = processBuilder.start();

            // Output
            OutputStream outputStream = process.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);

            // Input (La salida del Zoriz)
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); // Escucha lo que sale del Zoriz y lo guarda en el reader

            Scanner in = new Scanner(System.in);

            while (true) {
                String input = in.nextLine();

                writer.println(input);
                writer.flush();

                if (input.equalsIgnoreCase("buka")) {
                    break;
                }

                String randomNumber = reader.readLine();

                if (randomNumber != null && !randomNumber.isEmpty()) {
                    System.out.println(randomNumber);
                } else {
                    System.out.println("Happens");
                }
            }

            // Cerramos toda la kk
            in.close();
            writer.close();
            reader.close();
            process.destroy();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
