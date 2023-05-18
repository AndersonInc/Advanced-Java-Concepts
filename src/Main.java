import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    Staff emppart = new PartTime();

    public static void main(String[] args) {

        System.out.println("Hello world!");
        Main runner = new Main();
        //runner.details();
        FullTime full = new FullTime();
        full.y(new FullTime());


    }

    public void details() {
        System.out.println("Enter department here");
        String a = input.nextLine();
        emppart.department = a;
        System.out.println(emppart.department);

    }
}