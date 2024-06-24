package Files;

import java.io.*;

public class Demo {
    public static String filePath="D:\\sai";
    public static void main(String[] args) throws IOException {
       File file=new File("C:\\Users\\SAI VARDHAN\\Desktop\\Java Classes\\Class Notes","hello.txt");
       FileWriter w=new FileWriter(file);
       BufferedWriter bw=new BufferedWriter(w);
       bw.write("hello this is buffered writer");
       bw.newLine();
       bw.append("welcome to buffer reader");
       bw.append("java");
       bw.close();

       FileReader fileReader=new FileReader(file);
       BufferedReader bufferedReader=new BufferedReader(fileReader);
       String line=bufferedReader.readLine();
       while(line!=null){
           System.out.println(line);
           line= bufferedReader.readLine();
       }
        bufferedReader.close();




    }
}
