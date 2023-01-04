import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            String brand = sc.next();
            c.setBrand(brand);
            String color = sc.next();
            c.setColor(color);
            int price = sc.nextInt();
            c.setPrice(price);

            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car c=new Car();
            c=arr[i];
            System.out.println(c.getBrand()+c.getPrice()+c.getColor());
        }
    }
}
