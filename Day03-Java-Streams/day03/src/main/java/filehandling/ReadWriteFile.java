package filehandling;

import java.io.*;
public class ReadWriteFile{
    public static String readFile(String sourceFilePath) {
        StringBuilder content = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(sourceFilePath)) {
            int ch;
            while ((ch = fis.read()) != -1) {
                content.append((char) ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found!");
            return null;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return null;
        }
        return content.toString();
    }
    public static void writeFile(String destinationFilePath, String content) {
        if (content == null) {
            System.out.println("No content to write.");
            return;
        }
        try (FileOutputStream fos = new FileOutputStream(destinationFilePath)) {
            fos.write(content.getBytes());
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destinationFile = "Output.txt";


        String fileContent = readFile(sourceFile);

        writeFile(destinationFile, fileContent);
    }
}
