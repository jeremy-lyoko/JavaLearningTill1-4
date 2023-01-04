public class E1 {
    public static void main(String[] args) {
        int[] arr={1,2,3};

        try {
            System.out.println(arr[3]);
            System.out.println(2/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("suoyin");
        }catch (ArithmeticException e){
            System.out.println("0");
        }
    }
}
