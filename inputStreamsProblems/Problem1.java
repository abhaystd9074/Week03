package inputStreamsProblems;
import java.io.*;

public class Problem1 {
    public static void main(String[] args) {
        try {
            String path = "D:\\Week03\\Day04\\inputStreamsProblems\\data.txt";
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
