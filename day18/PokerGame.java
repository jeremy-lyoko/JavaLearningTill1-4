import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //准备牌

    static ArrayList<String> list = new ArrayList<>();

    static {
        String[] color = {"♥", "♠", "♦", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("大王");
        list.add("小王");
    }

    public PokerGame() {
        Collections.shuffle(list);//wash cards
        System.out.println(list);

        //发牌,底牌+人数
        ArrayList<String> base = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i < 3) {
                base.add(poker);
                continue;
            }
            if (i % 3 == 0) player1.add(poker);
            else if (i % 3 == 1) player2.add(poker);
            else player3.add(poker);
        }
        lookPoker("老张",player1);
        lookPoker("老李",player2);
        lookPoker("我自己",player3);
        lookPoker("底牌",base);


    }


    //看牌方法
    public void lookPoker(String name, ArrayList<String>list){
        System.out.print(name+":");
        for (String poker : list) {
            System.out.print(poker+" ");

        }
        System.out.println();
    }
}
