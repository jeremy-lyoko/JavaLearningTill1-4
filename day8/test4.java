import java.util.ArrayList;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("小明", "001", "123456");
        User u2 = new User("小王", "002", "123456");
        User u3 = new User("小李", "003", "123456");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        boolean flag = contains(id, list);
        if (flag){

        }else{
            System.out.println("查无此人");
        }
    }

    public static boolean contains(String id, ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            // User u=new User();
            String str = list.get(i).getId();
            if (str.equals(id)) {
                return true;
            }
        }
        return false;
    }
}
