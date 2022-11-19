package exercise;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {

        File file=new File("src/resources/uch.txt");

        File f1=new File("src/resources/bir.txt");
        File f2=new File("src/resources/ikki.txt");



        try {
            PrintWriter printWriter=new PrintWriter(file);
            BufferedReader bufferedReader_a=new BufferedReader(new FileReader(f1));
            BufferedReader bufferedReader_b=new BufferedReader(new FileReader(f2));

            String line_a=bufferedReader_a.readLine();
            String line_b=bufferedReader_b.readLine();

            while (line_a!=null || line_b!=null){

                if(line_a!=null){
                    printWriter.write(line_a);
                    line_a=bufferedReader_a.readLine();
                }

                if(line_b!=null){
                    printWriter.write(line_b);
                    line_b=bufferedReader_b.readLine();
                }
            }

            printWriter.flush();
            printWriter.close();

            bufferedReader_a.close();
            bufferedReader_b.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
