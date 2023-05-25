package mvc2;

import MVC.Student;

public class MVCpattern {
    public static void main(String[] Args){

        Employee model =  retriveEmployeeFromDatabase();
        EmpView view = new EmpView();
        EmpController controller = new EmpController(model,view);
        controller.displayDetails();
        controller.SetName("ANderson");
        controller.setDesignation("Student");
        controller.setLocation("kampala");
        controller.setEmpID("20/U/2061/eve ");
        controller.SetAge(56);
        controller.displayDetails();
    }

    private static Employee retriveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Anderson");
        employee.setEmpId("20/U/2061/EVE");
        employee.setLocation("Kampala");
        employee.setDesignation("Intern");
        employee.setAge(11);
        return employee;
    }

}
