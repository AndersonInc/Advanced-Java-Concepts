package InnerClasses.NestedClasses.Anonymous;

public class AnonymousClass {
    public void CreateAnonymous() {
        Anonymous ano = new Anonymous() {
            public void display() {
                System.out.println("This is the create anonymous class");
                System.out.println(age + " Is an element of the class Anonymous");
            }
        };
        System.out.println(ano.product(4, 3));
    }
}
