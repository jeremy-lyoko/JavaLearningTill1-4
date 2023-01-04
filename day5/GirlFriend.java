public class GirlFriend {
    //属性
    String name;
    private int age;
    public GirlFriend(int age){
        this.age=age;
        System.out.println("有无");
    }

    public void setAge(int a) {
        if (a > 13 && a < 44)
            age = a;
        else System.out.println("非法");
    }

    public int getAge() {
        return age;
    }

    //行为
    public void sleep() {
        System.out.println("睡觉");
    }

    public void eat() {
        System.out.println("恰饭");
    }
}
