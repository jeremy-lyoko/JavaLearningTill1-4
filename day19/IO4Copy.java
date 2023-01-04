import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO4Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("..\\day19\\bocchi.mp4");
        FileOutputStream fos = new FileOutputStream("..\\day19\\copy.mp4");

        long start = System.currentTimeMillis();
        int len;
        byte[] b = new byte[1024 * 1024 * 5];
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);
        }
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
