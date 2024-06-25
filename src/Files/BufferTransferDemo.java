package Files;

import java.io.*;

public class BufferTransferDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\SAI VARDHAN\\Desktop\\Java Classes\\Class Notes","file1.txt");
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        File writerFile=new File("C:\\Users\\SAI VARDHAN\\Desktop\\Java Classes\\Class Notes","file.txt");
        FileWriter fileWriter=new FileWriter(writerFile);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        String line=bufferedReader.readLine();
        while(line!=null){//1

            bufferedWriter.write(line);//2
            line=bufferedReader.readLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
