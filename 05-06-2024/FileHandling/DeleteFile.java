package FileHandling;
import java.io.File;
public class DeleteFile {
public static void main(String[] args) {
    try{
    File f=new File("File1.txt");
    
    if(f.delete()){
        System.out.println("The File is deleted");
    }
    else{
        System.out.println("The file is does not exists");
    }
    }
    catch(Exception e){
        System.out.println("An error occured");
    }

}
    
}
