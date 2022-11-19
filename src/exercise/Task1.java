package exercise;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {

        File file=new File("src/resources/uch.txt");

        File f1=new File("src/resources/bir.txt");
        File f2=new File("src/resources/ikki.txt");

        try {



            BufferedReader bufferedReader=new BufferedReader(new FileReader(f1));


            String line;
            FileWriter fileWriter=new FileWriter(file,true);
            PrintWriter printWriter=new PrintWriter(fileWriter);

            while((line=bufferedReader.readLine())!=null){
                printWriter.print(line);
            }

            printWriter.write('\n');



           bufferedReader=new BufferedReader(new FileReader(f2));

            while((line=bufferedReader.readLine())!=null){
                printWriter.print(line);
            }

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
