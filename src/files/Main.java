package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

       File file=new File("bir.txt");

//        boolean answer= false;
//        try {
//            answer = file.createNewFile();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("answer = " + answer);


        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());

    }
}
