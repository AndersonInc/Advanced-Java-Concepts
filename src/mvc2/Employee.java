package mvc2;

public class Employee {
    private String name,empId,location,designation;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmpId(String empId){
        this.empId = empId;
    }
    public String getEmpId(){
        return this.empId;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return  this.location;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
    public String getDesignation(){
        return  this.designation;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

}
