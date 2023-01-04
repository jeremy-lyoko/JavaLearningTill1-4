import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class InnerGame {
    static ArrayList<Integer> list = new ArrayList<>();
    static HashMap<Integer, String> hm = new HashMap<>();
    //序号和牌对应上

    static {
        String[] color = {"♥", "♠", "♦", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int serialNumber = 1;

        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "小王");
        list.add(serialNumber);

        System.out.println(hm);
        System.out.println(list);

    }

    public InnerGame() {
        Collections.shuffle(list);

        TreeSet<Integer> base = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
//tree可以自动排序,3个玩家加底牌存入序号
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            if (i < 3) {
                base.add(index);
                continue;
            }
            if (i % 3 == 0) player1.add(index);
            else if (i % 3 == 1) player2.add(index);
            else player3.add(index);

        }


        lookPoker("老张",player1);
        lookPoker("老李",player2);
        lookPoker("我自己",player3);
        lookPoker("底牌",base);


    }

    public void lookPoker(String name,TreeSet<Integer> ts){
        System.out.print(name);
        for (Integer t : ts) {
            String poker = hm.get(t);
            System.out.print(poker+" ");
        }
        System.out.println();
    }


}