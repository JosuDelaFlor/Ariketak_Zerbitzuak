import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuztienBatura {
    public static void main(String[] args) throws Exception {
        String[] files = {"resources\\automozioa.txt", "resources\\elektronika.txt", 
            "resources\\informatika.txt", "resources\\mekanika.txt"};

        for (String string : files) {
            new Thread(new FileReaderTask(string)).start();
        }
    }
}

/**
 * FileReaderTask
 */
class FileReaderTask implements Runnable {
    private String filePath;

    public FileReaderTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try {
            // String[] cmd = {"CMD", "/C", "type", filePath};
            // Process process = Runtime.getRuntime().exec(cmd);

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            Pattern pattern = Pattern.compile("\\d+");
            List<Integer> numbers = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    int n = Integer.parseInt(matcher.group());
                    numbers.add(n);
                }
            }
            reader.close();

            InnerGuztienBatura innerGuztienBatura = (nums) -> {
                int total = 0;
                for (Integer integer : numbers) {
                    total += integer;
                }
                return total;
            };

            int sum = innerGuztienBatura.sum(numbers);
            String filename = filePath.substring(4, filePath.lastIndexOf("."));
            System.out.println(filename+": "+sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * InnerGuztienBatura
 */
@FunctionalInterface
interface InnerGuztienBatura {
    int sum(List<Integer> numbers);
}
