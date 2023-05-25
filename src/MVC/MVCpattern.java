package MVC;

public class MVCpattern {

    public static void main(String[] args)
    {
        Student model  = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Anderson Kyakoonye");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase()
    {
        Student student = new Student();
        student.setName("Anderson");
        student.setRollno("2000702061");
        return student;
    }

}
