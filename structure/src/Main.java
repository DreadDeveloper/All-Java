public class Main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(1, "John Doe", 55000.0f); //using parameterised constructor
        Employee employee3 = new Employee();
        employee3.setEmpID(2);  //using setter
        employee3.setEmpName("Jane Doe");  //using setter
        employee3.setSalary(50000.0f);  //using setter
        System.out.println("Employee ID:" + employee1.getEmpID() + "\nEmployee name: " + employee1.getEmpName() + "\nEmployee salary: " + employee1.getSalary()); //using getter
        System.out.println("\nEmployee ID:" + employee2.getEmpID() + "\nEmployee name: " + employee2.getEmpName() + "\nEmployee salary: " + employee2.getSalary());
        System.out.println("\nEmployee ID:" + employee3.getEmpID() + "\nEmployee name: " + employee3.getEmpName() + "\nEmployee salary: " + employee3.getSalary());
    }
}
class Employee
{
    private int empID;  //variables/data-members are private to ensure *encapsulation*
    private String empName;
    private float salary;
    Employee() //Non-parameterised constructor
    {
        empID = 0;
        empName = null;
        salary = 0.0f;
    }
    Employee(int empID, String empName, float salary)  //Parameterised constructor and constructor *overloading* is achieved
    {
        this.empID = empID;  //this keyword is used to refer to the data members present in the class
        this.empName = empName;
        this.salary = salary;
    }
    public int getEmpID()  //getter is used to retrieve a private data member
    {
        return empID;
    }
    public void setEmpID(int empID)  //setter is used to set a private data member
    {
        this.empID = empID;
    }
    public String getEmpName()  //getter
    {
        return empName;
    }
    public void setEmpName(String empName)  //setter
    {
        this.empName = empName;
    }
    public float getSalary()  //getter
    {
        return salary;
    }
    public void setSalary(float salary)  //setter
    {
        this.salary = salary;
    }
}