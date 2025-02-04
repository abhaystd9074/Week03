package fileReaderProblems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        try{
            String path = "D:\\Week03\\Day04\\fileReaderProblems\\myintro.txt";
        FileReader fr=new FileReader(path);
        String s;
        BufferedReader br=new BufferedReader(fr);
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
