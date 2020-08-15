package reader_writer;
import java.io.*;
public class Writer_example {
    public static void main(String[] arg){

            String data ="this is learning path";
            try{
                Writer writer = new FileWriter("/Users/pankajchouhan/IO/file.txt");

                writer.write(data);
                System.out.println("done...");
                writer.close();

            }catch (Exception e){
                e.getStackTrace();
            }

    }
}
