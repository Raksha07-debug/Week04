package readuserinputfromconsole;

import java.io.*;
public class UserInput {
    private static final String OUTPUT_FILE = "out.txt";

    public static void main(String[] args) {
        String userData = getUserInput();
        writeToFile(userData);
    }
    public static String getUserInput() {
        StringBuilder userData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.print("Enter your age: ");
            String age = reader.readLine();
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            userData.append("Name: ").append(name).append("\n")
                    .append("Age: ").append(age).append("\n")
                    .append("Favorite Language: ").append(language).append("\n")
                    .append("\n");
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
        return userData.toString();
    }

    public static void writeToFile(String data) {
        try (FileWriter writer = new FileWriter(OUTPUT_FILE, true)) {
            writer.write(data);
            System.out.println("User information saved successfully to " + OUTPUT_FILE);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
