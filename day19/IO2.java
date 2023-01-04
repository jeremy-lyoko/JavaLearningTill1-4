import java.io.FileInputStream;
import java.io.IOException;

public class IO2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("..\\day19\\a.txt");
int b;
        while ((b=fis.read())!=-1) {
            System.out.println((char) b);
        }


    }
}
