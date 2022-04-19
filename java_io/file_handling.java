package java_io;

import java.io.File;
import java.io.FileInputStream;

public class file_handling {
    public static void main(String args[]){    
        try{    
          File f = new File("E:\\java_projects\\input.txt");
          FileInputStream fin=new FileInputStream(f); 
          byte fileContent[] = new byte[(int)f.length()];   
          fin.read(fileContent);  
          String s = new String(fileContent);
          System.out.println("File content: " + s);    
          fin.close();    
        } catch(Exception e){
          System.out.println(e);
        }    
       }
}
