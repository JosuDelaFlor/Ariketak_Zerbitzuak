import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "TASKLIST /SVC | findstr svchost.exe");
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            FileWriter fileWriter = new FileWriter("out/svchost.txt");

            String line;
            while ((line = reader.readLine()) != null) {
                fileWriter.write(line+"\n");
            }
            fileWriter.close();

            int exitCode = process.waitFor();
            System.out.println("Prozesua amaitu egin da: "+exitCode);
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Arazo bat egon da: "+e.getMessage());
        } 
    }
}
