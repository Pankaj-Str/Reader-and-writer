package reader_writer;
import java.io.StringWriter;
public class StringWriter_example {

    public static void main(String[] arg){
        String data = "welcome to Learning path";

        try{

            StringWriter stringWriter = new StringWriter();

            stringWriter.write(data);

            StringBuffer stringBuffer = stringWriter.getBuffer();

            System.out.println("this is buffer :- "+stringBuffer);

            String s = stringWriter.toString();

            System.out.println("this is :- "+s);

            stringWriter.close();
        }catch (Exception e){
            e.getStackTrace();
        }



    }
}
