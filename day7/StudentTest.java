import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        //录入学生信息
        Student s1 = new Student("张三", 22, 1);
        Student s2 = new Student("李四", 15, 2);
        Student s3 = new Student("小明", 17, 3);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        //添加新对象,并校验唯一性
        Student s4 = new Student("赵四", 34, 4);
        boolean flag = contains(arr, s4.getId());
        if (flag) {
            System.out.println("当前id已存在");
        } else {//判断数组有没有存满
            int count = getCount(arr);
            if (count == arr.length) {//存满,创建新数组
                Student[] newArr = createNewArr(arr);

                newArr[count] = s4;
                print(newArr);
            } else {//未满
                arr[count] = s4;
                print(arr);
            }
        }
        //通过id删除学生信息
        //找id对应的索引
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");
        int id= sc.nextInt();
        int index = getIndex(arr, id);
        if (index >= 0) {
            //删除
            arr[index] = null;
            System.out.println("删除完毕");
            print(arr);
        } else System.out.println("未找到id");
    }

    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student s = new Student();
            s = arr[i];
            if (s != null) {
                if (s.getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean contains(Student[] arr, int id) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (s != null) {
                if (id == s.getId()) {
                    flag = !flag;
                    break;
                }
            }
        }
        return flag;
    }

    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Student[] createNewArr(Student[] oldArr) {
        Student[] newArr = new Student[oldArr.length + 1];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }

    public static void print(Student[] arr) {

        for (int i = 0; i < arr.length; i++) {
            Student s = new Student();
            s = arr[i];
            if(s!=null)
            System.out.println(s.getName() + ":年龄" + s.getAge() + ",学号" + s.getId());
        }
    }
}