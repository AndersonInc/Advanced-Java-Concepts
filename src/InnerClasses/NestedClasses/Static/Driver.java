package InnerClasses.NestedClasses.Static;

class Driver {
    static int data = 30;

    public static void main(String args[]) {
        Driver.Inner obj = new Driver.Inner();
        obj.msg();
    }

    static class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }
}