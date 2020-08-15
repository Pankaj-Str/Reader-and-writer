package reader_writer;
import java.io.FileWriter;
import java.util.Scanner;
public class FileWriter_Example {

    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plz Enter the Input");
        String input_data = scanner.nextLine();

        try{

            //create FileWriter..
            FileWriter fileWriter = new FileWriter("/Users/pankajchouhan/IO/file.txt");

            // writes the string ..

            fileWriter.write(input_data);

            System.out.println("done..");
            //close the writer..

            fileWriter.close();

        }catch (Exception e){
            e.getStackTrace();
        }

    }
}
