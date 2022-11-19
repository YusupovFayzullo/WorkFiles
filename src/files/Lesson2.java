package files;

import java.io.File;

public class Lesson2 {
    public static void main(String[] args) {

        File file=new File("ikki.txt");

//        if(!file.exists()){
//            file.mkdir();
//        }
//        System.out.println(file.exists());
//
//        if(!file.exists()){
//            boolean mkdir = file.mkdir();
//            System.out.println(mkdir);
//        }

//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());

//        System.out.println(file.delete());


//        String[] list = file.list();

//        for (String s : list){
//            File subfile=new File("ikki.txt/"+s);
//            if(subfile.isFile()){
//                System.out.println(subfile.getName());
//            }else {
//                System.out.println("Folder");
//                System.out.println(subfile.getName());
//            }
//        }

        System.out.println(file.exists());

        System.out.println(file.delete());

//
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//           if(file1.isFile()){
//               System.out.println(file1.delete());
//           }else
//               System.out.println(file1.delete());
//
//        }


    }
}
