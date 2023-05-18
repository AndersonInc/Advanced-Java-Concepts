package InnerClasses.NestedClasses.MethodNested;

public class Outer {
    public static void main(String[] Args) {
        Outer out = new Outer();
        out.Animal();
    }

    public void Animal() {
        System.out.println("This animal is the  outer class method ");

        class InnerMethodClass {
            //System.out.println("This is an inner class printing");
            public int add(int x, int y) {

                return x + y;
            }

        }
        InnerMethodClass inner = new InnerMethodClass();
        System.out.println(inner.add(5, 5));
    }
}
