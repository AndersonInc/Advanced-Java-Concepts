package Serialization.Serialization_Deserialization;

import java.io.*;

public class Demo implements Serializable {
    public static int age;
    String name;
    String designation;

    Demo(String n, String d, int a) {
        this.designation = d;
        this.age = a;
        this.name = n;

    }

    public static void main(String[] Args) throws Exception {
        Demo demo = new Demo("Anderson", "Student", 40);
        System.out.println("Start of serialization");
        String filename = "file.txt";
        try {
            {
                System.out.println("Contents of the demo class are before serialization");
                System.out.println("Name: " + demo.name + " Designation: " + demo.designation + " age: " + demo.age);
                FileOutputStream fos = new FileOutputStream(filename);
                ObjectOutputStream ous = new ObjectOutputStream(fos);
                ous.writeObject(demo);
                ous.flush();
                ous.close();
                System.out.println("Serialization completed");
            }

        } catch (Exception e) {
            System.out.println("IOException caught " + e);
        }

        try {
            System.out.println("Start of deserialization");
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Demo demo1 = (Demo) ois.readObject();
            System.out.println("After Deserialization");
            System.out.println(demo1.name + " " + " " + demo1.designation + " " + demo1.age);
            ois.close();


        } catch (Exception e) {
            System.out.println("Caught an io error " + e);
        }
    }
}