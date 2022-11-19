package exercise;

import java.io.*;


public class Task3 {
    public static void main(String[] args) {


        File file=new File("src/resources");
        File resultFile=new File("src/result/result.txt");



        File[] files1 = file.listFiles();


        try {

            PrintWriter printWriter=new PrintWriter(resultFile);


            for (File f : files1) {

                if(f.isFile()){

                    BufferedReader bufferedReader=new BufferedReader(new FileReader(f));
                    String line;
                    while ((line=bufferedReader.readLine())!=null){
                        printWriter.println(line);
                    }
                    bufferedReader.close();

            }
            }
            printWriter.flush();
            printWriter.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

    }


        }