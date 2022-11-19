package exercise;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) throws IOException {
        File f1=new File("src/resources/bir.txt");
        File f2=new File("src/resources/ikki.txt");

        BufferedReader bufferedReader_a=new BufferedReader(new FileReader(f1));
        BufferedReader bufferedReader_b=new BufferedReader(new FileReader(f2));

        Set<String>  lines=new HashSet<>();
        Set<String>  result=new HashSet<>();

        String line;
        while ((line=bufferedReader_b.readLine())!=null){
            lines.add(line);
        }

        bufferedReader_b.close();

        while ((line=bufferedReader_a.readLine())!=null){

            if(!lines.contains(line)){
                result.add(line);
            }
        }

        PrintWriter printWriter=new PrintWriter(f1);

        for (String s : result) {

           printWriter.println(s);
        }

        printWriter.flush();
        printWriter.close();

    }
}
