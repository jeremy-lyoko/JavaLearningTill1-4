import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("..\\day21\\a.txt"));

        ArrayList<Student> o = (ArrayList<Student>) ois.readObject();

        for (Student student : o) {
            System.out.println(student);
        }
        ois.close();

    }
}
