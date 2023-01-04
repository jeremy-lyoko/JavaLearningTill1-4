import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap2 {
    public static void main(String[] args) {
        TreeMap<Student,Integer> tm=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o2.getAge() - o1.getAge();
                return i;
            }
        });
        Student s1=new Student(11,"wang");
        Student s2=new Student(21,"lli");
        Student s3=new Student(118,"sun");

        tm.put(s1,1);
        tm.put(s2,2);
        tm.put(s3,3);

        System.out.println(tm);
    }
}
