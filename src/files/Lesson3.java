package files;

import java.io.File;



public class Lesson3 {
    public static void main(String[] args) {

        File file=new File("D:\\test\\a.txt");

        String[] list = file.list();
        for (String s : list) {
            File f=new File(file,s);
            if(f.isDirectory()){

                System.out.println("d"+f.getName());
            }
            else {
                System.out.println(f.getName());
            }
        }


    }
}
