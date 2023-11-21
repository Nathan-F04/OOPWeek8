package ie.atu;
import java.io.FileWriter;
import java.io.IOException;
public class WriteClass {

    public static void main(String[] args) {

        //Specify the file name
        String fileName="File1.txt";


      try(FileWriter f =new FileWriter(fileName,true );){
              f.write("Adding data to file");
              f.write("This hasn't erased the previous text");
              System.out.println("Content successfully updated");

      }catch(Exception e){
          e.getStackTrace();
          System.out.println("Error");
        }


    }


}
