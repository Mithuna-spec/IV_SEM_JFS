import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNameToFile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of names: ");
			int n = sc.nextInt();
			sc.nextLine();
            
            FileWriter obj = new FileWriter("student.txt",true); //for appending
			for(int i=1;i<=n;i++){
				System.out.print("Enter name " + i + ": ");
                String name = sc.nextLine();
                obj.write("\n" +name);
            }
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