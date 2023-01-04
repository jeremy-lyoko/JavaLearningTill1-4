public class phoneTest {
    public static void main(String[] args) {
        phone p=new phone();
        p.price=1288;
        p.brand="apple";
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.game();
    }
}
