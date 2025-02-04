package stringBufferProblems;

public class Problem2 {
    public static void main(String[] args) {
        int n = 1000000; 
        String text = "Abhay";

       
        long startTime = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            buffer.append(text);
        }
        long endTime = System.nanoTime();
        long bufferTime = endTime - startTime;

        
        startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(text);
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;

   
        System.out.println("Time taken by StringBuffer: " + bufferTime / 1000000 + " ms");
        System.out.println("Time taken by StringBuilder: " + builderTime / 1000000 + " ms");
    }
}

