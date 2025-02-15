package bytearraystream;
import java.io.*;

public class ImageByteArrayConverter {
    public static byte[] imageToByteArray(String imagePath) {
        try (FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean byteArrayToImage(byte[] imageBytes, String outputPath) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);

            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        String inputImage = "wall.jpg";
        String outputImage = "output.jpg";

        byte[] imageBytes = imageToByteArray(inputImage);
        if (imageBytes != null) {
            System.out.println("Image successfully converted");
        } else {
            System.out.println("Failed to convert image to byte array.");
            return;
        }

        if (byteArrayToImage(imageBytes, outputImage)) {
            System.out.println("Image successfully written");
        } else {
            System.out.println("Failed to write image from byte array.");
        }
    }
}
