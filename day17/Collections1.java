import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"abc","def","122","233");
        Collections.shuffle(list);
       // System.out.println(list);
        String max = Collections.max(list);
        System.out.println(max);
        Collections.fill(list,"1111");
        System.out.println(list);
    }
}
