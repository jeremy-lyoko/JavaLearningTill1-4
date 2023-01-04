public class HashSetTest {
    public static void main(String[] args) {
        Stu s1=new Stu(23,"wang");
        Stu s2=new Stu(34,"li");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
