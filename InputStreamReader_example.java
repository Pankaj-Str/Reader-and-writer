package reader_writer;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.Reader;
import java.nio.charset.Charset;

public class InputStreamReader_example {

    public static  void  main(String[] arg){
        //create char array..
        char[] ch = new char[100];
        try{

           FileInputStream fileInputStream = new FileInputStream("/Users/pankajchouhan/IO/file.txt");
           InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
           InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream, Charset.forName("UTF8"));

            inputStreamReader.read(ch);
            System.out.println("-------get data from file--------");

            System.out.println(ch);

            System.out.println("-------get data from file UTF8--------");

            System.out.println(inputStreamReader1.getEncoding());

            inputStreamReader.close();


        }catch (Exception e){
            System.out.println(e);
        }
}
}
