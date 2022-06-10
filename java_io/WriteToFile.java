package java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class WriteToFile {
    public static void main(String args[]){    
        try{    
          File f = new File("E:\\java_projects\\input.txt");
          if (f.createNewFile()) {
            System.out.println("File created: " + f.getName());
          } else {
            System.out.println("File already exists.");
          }
    
          FileWriter myWriter = new FileWriter(f.getAbsolutePath());
          myWriter.write("Files in Java might be tricky, but it is fun enough!");
          myWriter.close();


        //   FileInputStream fin=new FileInputStream(f); 
        //   byte fileContent[] = new byte[(int)f.length()];   
        //   fin.read(fileContent);  
        //   String s = new String(fileContent);
        //   System.out.println("File content: " + s);    
        //   fin.close();    
        } catch(Exception e){
          System.out.println(e);
        }    
       }
}
