import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean result= list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(result);
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.set(1,"BBB"));
        System.out.println(list);
    }
}
