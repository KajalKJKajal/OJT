package FileHandling;

import java.io.FileWriter;
public class WriteFile {
    public static void main(String[] args) {
        String msg="Hello This is Anulekshmi ";
        try{
            FileWriter f=new FileWriter("File1.txt");
            f.write(msg);
            System.out.println("Success");
           f.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
