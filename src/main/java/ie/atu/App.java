package ie.atu;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Specify the file name
        String fileName,fileData;
        System.out.println("Enter filename");
        fileName=input.nextLine();



        try(PrintWriter output = new PrintWriter(new FileWriter(fileName,true))){
            System.out.println("Enter data");
            fileData=input.nextLine();

            output.println(fileData);
            System.out.println("Success!");


        }catch(Exception e){
            e.getStackTrace();
            System.out.println("Error");
        }
    }


}
