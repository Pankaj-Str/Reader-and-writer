package reader_writer;
import java.io.Reader;
import java.io.FileReader;
public class Reader_example {

    public static  void  main(String[] arg){
            //create char array..
        char[] ch = new char[100];
        try{

            //use reader class
            Reader reader = new FileReader("/Users/pankajchouhan/IO/file.txt");

            //check if reader is ready
            System.out.println("this is ready .."+reader.ready());
            // read characters
            reader.read(ch);
            System.out.println("---------------");
            System.out.println(ch);
            System.out.println("---------------");

            reader.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
