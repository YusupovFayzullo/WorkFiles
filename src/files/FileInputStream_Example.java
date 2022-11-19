package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Example {
    public static void main(String[] args) {


        try {
            FileInputStream fileInputStream=new FileInputStream("src/resources/bir.txt");
            int b;



            while((b=fileInputStream.read())!=-1){
                System.out.print((char)b);
            }
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
