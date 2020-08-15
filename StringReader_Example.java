package reader_writer;
import java.io.StringReader;
public class StringReader_Example {

    public static void main(String[] arg){

        String data = "welcome to Learning path";

        char[] chars = new char[100];

        try{

        StringReader stringReader = new StringReader(data);
        stringReader.skip(5);
        stringReader.read(chars);

        System.out.println(chars);



        }catch (Exception e){
            e.getStackTrace();
        }
    }

}
