import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap();
        Student s1 = new Student(23, "wang");
        Student s2 = new Student(3, "liu");
        Student s3 = new Student(38, "zhang");
        Student s4 = new Student(38, "zhang");
        hm.put(s1, "cn");
        hm.put(s2, "eu");
        hm.put(s3, "jap");
        hm.put(s4, "us");
        hm.forEach((k, v) -> System.out.println(k + "+" +v));
    }
}
