import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        Collections.addAll(l1, "蔡徐坤,24", "周杰伦,44", "齐秦,54");
        Collections.addAll(l2, "g1,21", "g2,34", "g3,44");

        Stream<String> stream1 = l1.stream().filter(s -> s.split(",")[0].length() == 3);
        Stream<String> stream2 = l2.stream().filter(s -> s.split(",")[0].equals("g")).skip(1);

        Stream.concat(stream1, stream2).map(
                s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))
        ).forEach(s -> System.out.println(s));

    }
}

class Actor {
    private String name;
    private int age;

    public Actor() {
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Actor{name = " + name + ", age = " + age + "}";
    }
}
