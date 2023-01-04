import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("=========欢迎来到学生管理系统==========");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> delStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("5:退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static ArrayList<Student> addStudent(ArrayList<Student> list) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号姓名年龄地址");
        String id = null;
        while (true) {
            id = sc.next();
            boolean flag = contains(list, id);
            if (flag) {
                System.out.println("学号已存在,请重新录入");
            } else break;
        }
        String name = sc.next();
        int age = sc.nextInt();
        String address = sc.next();

        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        list.add(s);
        System.out.println("添加成功!");
        return list;
    }

    public static ArrayList<Student> delStudent(ArrayList<Student> list) {
        System.out.println("请输入要删除的学生学号");
        Scanner sc = new Scanner(System.in);
        String delId = sc.next();
        boolean flag = contains(list, delId);
        if (!flag) {
            System.out.println("学生不存在");
        } else {
            list.remove(getIndex(list, delId));
            System.out.println("删除完毕!");
        }
        return list;
    }

    public static ArrayList<Student> updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号");
        String changeId= sc.next();
        int index=getIndex(list,changeId);
        if(index==-1){
            System.out.println("学生不存在");
            return list;
        }
        System.out.println("输入修改的学生姓名年龄地址");
        String newName= sc.next();
        list.get(index).setName(newName);
        int newAge= sc.nextInt();
        list.get(index).setAge(newAge);
        String newAddress= sc.next();
        list.get(index).setAddress(newAddress);
        System.out.println("修改成功");
        return list;
    }

    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t地址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge()
                    + "\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {

        if (list.size() == 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
