import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private String face;
    String[] level = {"气宇轩昂", "相貌平平", "面目狰狞"};
    String[] affect = {"造成了暴击", "效果一般", "不曾伤得分毫"};

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
        setFace();
    }

    public String getFace() {
        return face;
    }

    public void setFace() {
        Random r = new Random();
        int index = r.nextInt(level.length);
        this.face = level[index];
    }

    //属性展示
    public void showInfo(Role role) {
        System.out.println("角色1,姓名:" + role.getName() + " 血量:" + role.getBlood() + " 颜值:" + role.getFace());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //Role r1=new Role();
    //r1.attack(r2);
    //方法调用者攻击参数
    public void attack(Role role) {
        Random r = new Random();
        int damage = r.nextInt(40);
        int remain = role.getBlood() - damage;
        //输入的类，获取血量，并扣伤害，计算剩余
        remain = remain < 0 ? 0 : remain;
        //剩余为负数时归零
        role.setBlood(remain);
        //剩余血量set进输入类中
        //效果判断
        String a = null;
        if (damage < 10)
            a = affect[2];
        else if (damage < 25)
            a = affect[1];
        else
            a = affect[0];
        System.out.println(this.getName() + "举起拳头打了" + role.getName() +
                ",造成" + damage + "点伤害," + role.getName() + "剩余" + remain + "点血量 " +
                a);
    }
}
