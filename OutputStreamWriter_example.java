package reader_writer;
import java.io.*;
public class OutputStreamWriter_example {
    public static void main(String[] arg){

        String data ="this is learning path-----";
        try{

            FileOutputStream fileOutputStream = new FileOutputStream("/Users/pankajchouhan/IO/file.txt");

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

            outputStreamWriter.write(data);
            System.out.println("done...");
            outputStreamWriter.close();

        }catch (Exception e){
            e.getStackTrace();
        }

    }
}
