import java.util.Random;
//随机数组求低于平均值的数量
public class arr2 {
    public static void main(String[] args) {
        int[] arr2 = new int[4];
        Random r = new Random();


        for (int i = 0; i < arr2.length; i++) {
            int n = r.nextInt(100);
            arr2[i] = n;
        }
        //求和
        int sum=0;
        for (int i = 0; i < arr2.length; i++) {
            sum=sum+arr2[i];
        }
        System.out.println("和为"+sum);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" "+arr2[i]);

        }
        //求平均
        int av=sum/arr2.length;
        System.out.println("平均值为"+av);
        //低于平均的数量
        int count=0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]<av){
                count++;
            }
        }
        System.out.println("不及格的数量"+count);

    }
}
