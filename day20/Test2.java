import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //加密解密
        FileInputStream fis = new FileInputStream("..\\day20\\Ency.png");
        FileOutputStream fos = new FileOutputStream("..\\day20\\Deco.png");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b ^1);
        }
        fos.close();
        fis.close();

    }
}
