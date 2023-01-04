import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        Stu s1=new Stu(23,"23");
        Stu s2=new Stu(24,"23");
        Stu s3=new Stu(23,"23");
        Stu s4=new Stu(28,"23323");
        HashSet<Stu> hs=new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);

    }
}
