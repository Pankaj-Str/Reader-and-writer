package reader_writer;
import java.io.FileReader;
import java.io.BufferedReader;
public class BufferedReader_example {

    public  static  void main(String[] arg){
        char[] chars = new char[100];

        try{

            FileReader fileReader = new FileReader("/Users/pankajchouhan/IO/file.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // read characters

            bufferedReader.skip(20);// skip data characters...
            bufferedReader.read(chars);
            System.out.println(chars);

            bufferedReader.close();

        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
