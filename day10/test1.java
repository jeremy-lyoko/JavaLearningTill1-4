public class test1 {
    String carName;
    int price;
    public void show(){
        Engine e=new Engine();
        System.out.println(e.engineName);
    }
    class Engine{
       String engineName;
       int age;
       public void show(){
           System.out.println(carName);
       }
    }
}
