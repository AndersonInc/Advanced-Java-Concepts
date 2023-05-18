package InnerClasses.NestedClasses.Nested;

public class Outer {
    Inner inner = new Inner();
    private int x = 10;

    public int add(int x, int y) {
        System.out.println("Inside Outer method");
        return x + y;
    }

    public class Inner {
        public void InnerMethod() {
            System.out.println("Inside the method");
            System.out.println("This is from an outer class method " + add(5, 6));
            System.out.println("This is a private member of the outer class " + x);

        }
    }

}
