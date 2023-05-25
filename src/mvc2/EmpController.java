package mvc2;

public class EmpController {
    private Employee model;
    private EmpView view;
    public EmpController(Employee model,EmpView view){
        this.model = model;
        this.view = view;

    }
    public void SetName(String name){
        this.model.setName(name);

    }
    public String getName(){
        return this.model.getName();
    }
    public void setEmpID(String empID){
        this.model.setEmpId(empID);
    }
    public String getEmpId(){
        return this.model.getEmpId();
    }
    public void setLocation(String location){
        this.model.setLocation(location);
    }
    public String getLocation(){
        return this.model.getLocation();
    }
    public void setDesignation(String designation){
        this.model.setDesignation(designation);
    }
    public String getDesignation(){
        return this.model.getDesignation();
    }
    public void SetAge(int age){
        this.model.setAge(age);
    }
    public int getAge(){
        return this.model.getAge();
    }
    public void displayDetails(){
        view.EmpViewDetails(model.getName(),model.getEmpId(),model.getLocation(),model.getDesignation(),model.getAge());
    }


}
