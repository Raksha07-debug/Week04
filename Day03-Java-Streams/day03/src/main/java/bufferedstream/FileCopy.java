package bufferedstream;

import java.io.*;
public class FileCopy {
    public static final int BUFFER_SIZE = 4096;

    public static void main(String[] args) {
        String input = "C:\\Week04\\Day03-Java-Streams\\day03\\src\\input.txt";
        String buffered = "C:\\Week04\\Day03-Java-Streams\\day03\\src\\output.txt";
        String unbuffered = "C:\\Week04\\Day03-Java-Streams\\day03\\src\\out.txt";

        long startTime = System.nanoTime();
        copyFileUsingBufferedStreams(input, buffered);
        long endTime = System.nanoTime();
        System.out.println("Buffered Streams Time: " + (endTime - startTime) / 1000000 + " ms");

        startTime = System.nanoTime();
        copyFileUsingUnbufferedStreams(input, unbuffered);
        endTime = System.nanoTime();
        System.out.println("Unbuffered Streams Time: " + (endTime - startTime) / 1000000 + " ms");
    }

    public static void copyFileUsingBufferedStreams(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully using Buffered Streams");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyFileUsingUnbufferedStreams(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("File copied successfully using Unbuffered Streams");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
