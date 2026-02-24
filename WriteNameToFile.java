import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNameToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            FileWriter obj = new FileWriter("student.txt");
            obj.write(name);
            obj.close();

            System.out.println("Name written successfully");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}