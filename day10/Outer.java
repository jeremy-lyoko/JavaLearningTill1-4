public class Outer {
    private int a=10;
    public class Inner{
        private int a=20;
        public void show(){
            int a=30;
            System.out.println(Outer.this.a);
        }
    }
}
