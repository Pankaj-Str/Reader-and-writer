package reader_writer;
import java.io.FileReader;
public class FileReader_example {

        public static void main(String[] arg){
            //create an array of character..
            char[] ch = new char[100];
            try{
                // create Reader using the FileReader...
                FileReader fileReader = new FileReader("/Users/pankajchouhan/IO/file.txt");
                //read character
                fileReader.read(ch);
                System.out.println(ch);

            }catch (Exception e){
                e.getStackTrace();
            }
        }


}
