package InnerClasses.NestedClasses.Static;

class Outer {
    static int x = 4;

    public static void main(String[] Args) {
        Outer.Inner in = new Outer.Inner();
        System.out.println(in.add(10, 6));
        Outer out = new Outer();
        out.name();

    }

    public void name() {
        System.out.println("I am an outer class method");
    }

    static class Inner {
        public int add(int z, int y) {
            System.out.println("This is inside the inner class");
            System.out.println(x + " is an element of the outer class");
            return z + x;
        }

    }
}
