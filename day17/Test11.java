import java.util.ArrayList;
import java.util.Collections;

public class Test11 {
    public static void main(String[] args) {
        ArrayList<String> list0 = new ArrayList<>();
        Collections.addAll(list0, "zhang", "li", "wang", "wu");
        ArrayList<String> list00 = new ArrayList<>();
        Collections.addAll(list00, "g1", "g2", "g3");
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 0, 0, 0, 0, 1);
        ArrayList<String> listCopy = new ArrayList<>();

        int range = list0.size();
        for (int i = 0; i < 4; i++) {
            System.out.println("======第"+i+"次点名======");
            for (int j = 0; j < range; j++) {
                Collections.shuffle(list0);
                String name = list0.remove(0);
                System.out.println(name);
                Collections.addAll(listCopy, name);
            }
            list0.addAll(listCopy);
            listCopy.clear();
        }


    }
}
