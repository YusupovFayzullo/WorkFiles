package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson6 {
    public static void main(String[] args) {

        File file=new File("src/resources/ikki.txt");
        try (FileReader fileReader = new FileReader(file)) {

            int read = fileReader.read();

            while (read!=-1){
                System.out.print((char)read);
                read=fileReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
