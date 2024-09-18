import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessMain {
    /**
     * Ez doa (:
     * @param args
     */
    public static void main(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("java", "AnimaliakMain");
            processBuilder.directory(new java.io.File("."));
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("Prozesua amaitu egin da: "+exitCode);

        } catch (IOException | InterruptedException e) {
            System.out.println("Arazo bat egon da: "+e.getMessage());
        }
    }
}
