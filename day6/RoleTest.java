public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("罗翔", 40);
        Role r2 = new Role("张三", 40);
        r1.showInfo(r1);
        r2.showInfo(r2);

        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r2.getName()+"被KO");
                break;
            }
            r2.attack(r1);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"被KO");
                break;
            }
        }
    }
}
