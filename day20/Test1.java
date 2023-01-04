import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//拷贝文件夹,包括子文件

public class Test1 {
    public static void main(String[] args) throws IOException {

        File src = new File("..\\day20\\fold");
        File dest = new File("..\\day20\\dest");

        copydir(src, dest);

    }

    private static void copydir(File src, File dest) throws IOException {
        //递归
        dest.mkdirs();//file对象可以是路径,文件,不存在.
        // 路径下没有dest文件夹时创建一个
        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream
                        (new File(dest, file.getName()));
                //拷贝目的地是dest下
                //新建file对象,父对象,原文件取名
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();

            } else {
                copydir(file, dest);
            }
        }
    }


}
