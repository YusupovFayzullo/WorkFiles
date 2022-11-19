package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BuffeWriter_Example{

    public static void main(String[] args) {

        File file=new File("src/resources/bir.txt");


        try (FileWriter writer = new FileWriter(file,true)) {
            BufferedWriter writer1=new BufferedWriter(writer);
            writer1.newLine();
            writer1.write("salomlar123");
           writer1.write(34);
            writer1.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
