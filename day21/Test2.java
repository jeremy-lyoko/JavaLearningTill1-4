import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test2 {
    //将个数不确定的多个自定义对象序列化到文件
    public static void main(String[] args) throws IOException {

        Student s1 = new Student("zhangsan", 18, "hunan");
        Student s2 = new Student("lisi", 28, "henan");
        Student s3 = new Student("wang", 24, "beijing");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("..\\day21\\a.txt"));

        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        /*oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);*/
        oos.writeObject(list);

        oos.close();

    }
}
