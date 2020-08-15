package reader_writer;
import java.io.PrintWriter;
public class PrintWriter_example {

    public static void main(String[] arg){

        String name = "learning path";
        int number = 56;
        float f = (float) 5.6;

        try{

            PrintWriter printWriter = new PrintWriter("/Users/pankajchouhan/IO/file.txt");

            printWriter.printf("this is number %d \n",number);
            printWriter.printf("this is float %f \n",f);
            printWriter.println("this is String :-"+name);

            System.out.println("done...");

            printWriter.close();

        }catch (Exception e){
            System.out.println(e);

        }    }
}
