package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lesson5 {


    public static void main(String[] args) {

        try {

            FileWriter writer=new FileWriter("src/resources/ikki.txt",true);

            writer.write('A');
            writer.write(66);
           // writer.write('\n');
            String newLine = System.getProperty("line.separator");
            writer.write(newLine);
            writer.write("salom");
            writer.write(newLine);
            char[] news=new char[]{'a','b','c','d'};

            writer.write(news);
            writer.write(newLine);

            writer.write("12345678",1,3); // 1 ta tashlab 3 ta yozadi

            writer.write('\n');
            writer.write("s");

            writer.flush();
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
