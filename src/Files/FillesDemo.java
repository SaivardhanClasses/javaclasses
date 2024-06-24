package Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FillesDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\sai","hello.txt");
//        System.out.println(file.exists());//false//true
//        System.out.println(file.createNewFile());//false
//        System.out.println(file.exists());//true//true
        FileWriter fw=new FileWriter(file,true);
        fw.write("\n this content is added newly");
        fw.close();
        FileReader fr=new FileReader(file);
        int n;
        while((n=fr.read())!=-1){
            System.out.print((char)n);
        }
        fr.close();
    }
}
