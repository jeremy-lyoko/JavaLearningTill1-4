import java.io.FileReader;
import java.io.IOException;

public class Read1 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("..\\day20\\poem.txt");

        int ch;
        /*while ((ch=fr.read())!=-1){
            System.out.print((char) ch);
        }*/

        int read1 = fr.read();
        System.out.println((char) read1);

        int read2 = fr.read();
        System.out.println((char) read1);

        int read3 = fr.read();
        System.out.println((char) read1);

        fr.close();

    }
}
