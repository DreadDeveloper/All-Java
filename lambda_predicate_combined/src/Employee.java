public class Employee
{
	private int empId;
	private String empName;
	private float salary;
	private short experience;
	Employee(int empId, String empName, float salary, short experience)
	{
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.experience = experience;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public float getSalary()
	{
		return salary;
	}
	public short getExperience()
	{
		return experience;
	}

}
