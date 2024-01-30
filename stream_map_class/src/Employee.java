public class Employee
{
	private final int empNo;
	private final String empName;
	public float empSalary;
	Employee(int empNo, String empName, float empSalary)
	{
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpNo()
	{
		return empNo;
	}
	public String getEmpName()
	{
		return empName;
	}
}
