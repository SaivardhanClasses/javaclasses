package Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTransferDemo {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\SAI VARDHAN\\Desktop\\Java Classes\\Class Notes", "hello.txt");
            FileReader fileReader = new FileReader(file);
            int n=0;
            String str="";
            while((n=fileReader.read())!=-1)
            {
                str=str+(char)n;
            }
            File file1= new File("C:\\Users\\SAI VARDHAN\\Desktop\\Java Classes\\Class Notes", "file.txt");
            FileWriter fileWriter=new FileWriter(file1);
            fileWriter.write(str);
            fileWriter.close();
            fileReader.close();
        }
        catch(Exception e){
            e.getMessage();
        }

    }
}
