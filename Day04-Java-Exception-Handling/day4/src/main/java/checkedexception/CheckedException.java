package checkedexception;
import java.io.*;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String file="C:\\Week04\\Day04-Java-Exception-Handling\\day4\\src\\data.txt";
        try {
            System.out.println(readFileContents(file));
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
    public static String readFileContents(String filePath) throws FileNotFoundException  {
        File file = new File(filePath);
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
        }

        return content.toString().trim();
    }

}