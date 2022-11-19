package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream_Example {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream=new FileOutputStream("src/resources/bir.txt",true);

            fileOutputStream.write('\n');
            fileOutputStream.write(65);

            fileOutputStream.flush();
            fileOutputStream.write(12);
            fileOutputStream.write(13);
            fileOutputStream.write(14);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
