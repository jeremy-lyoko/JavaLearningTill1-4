import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        /*Student s1=new Student("张三","23");
        Student s2=new Student("李四","14");
        Student s3=new Student("王五","24");
        list.add(s1);
        list.add(s2);
        list.add(s3);*/

        for (int i = 0; i < 2; i++) {
            Student s = new Student();
            String name = sc.next();
            s.setName(name);
            String age=sc.next();
            s.setAge(age);
            list.add(s);
        }
        System.out.println(list);
    }
}
