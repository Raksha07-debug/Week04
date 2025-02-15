package storeandretrievedata;

import java.io.*;

public class StudentDataStreams {
    private static final String FILE_NAME = "students.dat";

    public static void storeStudentData(Student[] students) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Student student : students) {
                dos.writeInt(student.rollNumber);
                dos.writeUTF(student.name);
                dos.writeDouble(student.gpa);
            }
            System.out.println("Student data stored successfully");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void retrieveStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No- " + rollNumber + ", Name- " + name + ", GPA- " + gpa);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Raksha", 9.8),
                new Student(2, "Sarc", 6.5),
                new Student(3, "Pak", 9.9)
        };

        storeStudentData(students);
        retrieveStudentData();
    }
}
