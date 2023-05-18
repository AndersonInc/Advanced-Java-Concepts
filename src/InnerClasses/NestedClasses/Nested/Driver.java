package InnerClasses.NestedClasses.Nested;

public class Driver {
    public static void main(String[] Args) {
        //Outer.Inner inner  = new Outer.Inner();
        Outer out = new Outer();
        int z = out.add(10, 5);
        System.out.println(z);
        out.inner.InnerMethod();


    }
}
