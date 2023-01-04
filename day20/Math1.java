public class Math1 {
    public static void main(String[] args) {
        int start=99;
        int change;

        for (int i = 0; i < 20; i++) {
            int temp=start*2-100;
            if(temp<0){
                change=temp+100;
            }else change=temp;
            System.out.println(change);
            start=change;
        }
    }
}
