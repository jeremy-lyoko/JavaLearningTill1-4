import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZIpStream2 {
    public static void main(String[] args) throws IOException {
        File src=new File("..\\day21\\count.txt");
        File dest=new File("..\\day21");
        toZip(src,dest);


    }

    public static void toZip(File src,File dest) throws IOException {
        ZipOutputStream zos=new ZipOutputStream(new FileOutputStream(new File(
                dest,"count.zip")));
        //zip流关联fileout流
        ZipEntry entry=new ZipEntry("count.txt");
        //目的地entry对象

        zos.putNextEntry(entry);
        //zip对象放到压缩包

        //拷贝字节
        FileInputStream fis=new FileInputStream(src);
        int b;
        while ((b=fis.read())!=-1){
            zos.write(b);
        }
        fis.close();


        zos.closeEntry();
        zos.close();

    }
}
