package FileHandling;

import java.io.File;
public class CreatFile {  
  public static void main(String[] args) {  
    try {  
      File myObj = new File("File1.txt"); 

      if (myObj.createNewFile()) 

      { System.out.println("___File created___ ");  } 
      else

      {System.out.println("____File allread exists____ "); }
    } 
    
    catch (Exception e)
     {System.out.println("___An error occurred.____");}  
  }  
} 



