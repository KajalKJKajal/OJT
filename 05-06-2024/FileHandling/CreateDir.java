package FileHandling;

import java.io.File;
public class CreateDir {
    public static void main(String[] args) {
        File f=new File("NewFolder");
        if(f.mkdir()){
            System.out.println("Folder created");
        }
        else{
            System.out.println("error");
        }
    }
}
