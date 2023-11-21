package ie.atu;
import java.io.FileWriter;
import java.io.IOException;
public class WriteClass {

    public static void main(String[] args) {

        //Specify the file name
        String fileName="File1.txt";


      try(FileWriter f =new FileWriter(fileName);){
              f.write("Adding data to file");
              System.out.println("Content successfully updated");

      }catch(Exception e){
          e.getStackTrace();
          System.out.println("Error");
        }


    }


}
