package exercise;

import java.io.*;

public class Task5 {

    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("src/resources");
        File fileResult=new File("src/result/result.txt");


        PrintWriter printWriter=new PrintWriter(fileResult);

        makeTree(file,printWriter);

    }

    private static void makeTree(File file, PrintWriter printWriter)  {


        File[] files = file.listFiles();
        for (File file1 : files) {

            if (file1.isDirectory()) {
                makeTree(file1,printWriter);

            } else {

                try {
                    String line;

                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
                    while ((line = bufferedReader.readLine()) != null) {
                        printWriter.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                printWriter.flush();
                printWriter.close();
            }



        }

        }
}
