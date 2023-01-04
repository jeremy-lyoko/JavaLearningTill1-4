import java.io.FileReader;
import java.io.IOException;

public class Read2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("..\\day20\\poem.txt");
        char[] chars = new char[2];
        int len;

        while ((len = fr.read(chars)) != -1) {
            System.out.print(new String(chars,0,len));
        }
        fr.close();

    }
}
