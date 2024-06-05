package FileHandling;

import java.io.FileReader;
public class ReadFile {
    public static void main(String[] args) {
        char[] ch=new char[10];
        try{
            FileReader f=new FileReader("File1.txt");
            f.read(ch);
            System.out.println(ch);
        f.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
