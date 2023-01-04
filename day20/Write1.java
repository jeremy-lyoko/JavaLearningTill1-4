import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("..\\day20\\poem.txt");

        //FileOutputStream fos=new FileOutputStream("..\\day20\\a.txt");

        FileWriter fw=new FileWriter("..\\day20\\a.txt",true);

        char[] chars={'涵','梦'};
        fw.write("kitakita");
        fw.flush();
        fw.write(chars);
        //fw.close();


    }

}
