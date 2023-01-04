import java.io.FileInputStream;
import java.io.IOException;

public class IO3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("..\\day19\\b.txt");
        byte[] b = new byte[3];
        int len;
        len = fis.read(b);
        System.out.println(len);
        String str = new String(b);
        System.out.println(str);

        len = fis.read(b);
        System.out.println(len);
        String str2 = new String(b);
        System.out.println(str2);

        len = fis.read(b);
        System.out.println(len);
        String str3 = new String(b);
        System.out.println(str3);

        fis.close();
    }


}
