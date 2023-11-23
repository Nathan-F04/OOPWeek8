package ie.atu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter filename");
        String fileName=input.nextLine();



        try{
            Scanner inputFile= new Scanner(new File(fileName));
            while(inputFile.hasNext()){
                String line=inputFile.nextLine();
                System.out.println(line);
            }
        } catch(FileNotFoundException e){
            e.getStackTrace();
            System.out.println("File not found");
        }
    }


}

