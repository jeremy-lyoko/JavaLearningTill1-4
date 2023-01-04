import java.io.FileOutputStream;
import java.io.IOException;

public class IO1 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream fos = new FileOutputStream("C:\\Users\\1339\\IdeaProjects\\day19\\a.txt");
        FileOutputStream fos = new FileOutputStream("..\\day19\\a.txt");

        byte[] bytes = {99, 98, 99};
        fos.write(111);
        fos.write(bytes);

        String wrap = "\r";
        fos.write(wrap.getBytes());
        String str = "bocchi";
        byte[] bytes1 = str.getBytes();
        fos.write(bytes1);
        fos.close();

    }
}
