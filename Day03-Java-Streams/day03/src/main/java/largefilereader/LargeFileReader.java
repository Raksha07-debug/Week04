package largefilereader;

import java.io.*;

public class LargeFileReader {
    public static String readLargeFile(String filePath) {
        StringBuilder sb=new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    sb.append(line).append("\n");
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String filePath = "C:\\Week04\\Day03-Java-Streams\\day03\\src\\examplefile.txt";
        readLargeFile(filePath);
    }
}
