package reader_writer;
import java.io.*;
public class BufferedWriter_example {

    public static void main(String[] arg){

        String inputdata ="welcome to p4n";
        try{

            FileWriter fileWriter = new FileWriter("/Users/pankajchouhan/IO/file.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(inputdata);

             System.out.println("done...");

            bufferedWriter.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
