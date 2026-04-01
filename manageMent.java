import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class manageMent {
    String fileStringy = "";
    manageMent(){
    try (Scanner fileScanner = new Scanner(new File("myfile.txt"))) { //
        while (fileScanner.hasNextLine()) { //
            String data = fileScanner.nextLine(); //
            fileStringy += data;
            fileStringy += "\n";
        }
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred: File not found.");
        e.printStackTrace();
    }}
}
