import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStream1 {
    public static void main(String[] args) throws IOException {
        File src = new File("..\\day21\\zipTest.zip");
        File dest = new File("..\\day21\\");


         unZip(src,dest);
    }

    public static void unZip(File f, File d) throws IOException {

        ZipInputStream zip = new ZipInputStream(new FileInputStream(f));

        ZipEntry entry;

        while ((entry = zip.getNextEntry()) != null) {
            //判断是不是文件夹
            if (entry.isDirectory()) {
                //父路径,目标的d文件夹,子路径自己文件名
                File file = new File(d, entry.toString());
                file.mkdirs();

            } else {
                FileOutputStream fos = new FileOutputStream(new File(d, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }

}
