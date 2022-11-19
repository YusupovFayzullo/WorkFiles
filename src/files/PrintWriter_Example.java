package files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Example {
    public static void main(String[] args) {


        try ( FileWriter fileWriter=new FileWriter("src/resources/bir.txt");
                PrintWriter printWriter = new PrintWriter(fileWriter) ){

            printWriter.println("fayzullo");
            printWriter.print("jasur");
            printWriter.println("sdfd");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
