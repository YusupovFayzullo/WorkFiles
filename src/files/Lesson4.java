package files;

import java.io.File;
import java.io.IOException;

public class Lesson4 {

    public static void main(String[] args) throws IOException {
        File file=new File("src/resources/ikki.txt");



        System.out.println(file.canRead());

        System.out.println(file.canWrite());

        System.out.println("file.getParentFile() = " + file.getParentFile());
        System.out.println("file.getParent() = " + file.getParent());

        System.out.println("file.canExecute() = " + file.canExecute());

        long freeSpace = file.getFreeSpace();
        System.out.println("freeSpace = " + freeSpace);

        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.isAbsolute() = " + file.isAbsolute());
        System.out.println("file.length() = " + file.length());

        file.listFiles(); // Barcha fayl va papkalarni qaytaradi

    }
}
