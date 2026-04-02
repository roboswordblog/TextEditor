import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

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
    void save(String content) throws IOException{
        Files.writeString(Path.of("a.txt"), content);
    }
}
