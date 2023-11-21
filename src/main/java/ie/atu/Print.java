package ie.atu;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class Print {

    public static void main(String[] args) {

        //Specify the file name
        String fileName="File2.txt";
        String data="test";

        //FileWriter f =new FileWriter(fileName,true);


        try( PrintWriter output = new PrintWriter(new FileWriter(fileName,true))){
           output.println(data);
            output.printf("new line");
            System.out.println("Success");
        }catch(Exception e){
            e.getStackTrace();
            System.out.println("Error");
        }


    }


}