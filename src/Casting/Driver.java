package Casting;

public class Driver {
    public static void main(String[] Args){
//        B b = new B();
//        A a = b;
//        a.show1();
        A obj =  new B();//Upcasting
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();

        System.out.println("Hello");
        



    }
}
