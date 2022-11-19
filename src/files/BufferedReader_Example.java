package files;

import java.io.*;

public class BufferedReader_Example {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader(new File("src/resources/bir.txt"))) {

            BufferedReader bufferedReader=new BufferedReader(fileReader);

//         int n;
//
//            while ((n=bufferedReader.read())!=-1){
//                System.out.print((char)n);
//            }

            String line;

            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
