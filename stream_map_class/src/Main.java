import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "John Doe", 56000.0f));
		employeeList.add(new Employee(2, "Jane Doe", 60000.0f));
		employeeList.add(new Employee(3, "Joe Mama", 46000.0f));
		employeeList.add(new Employee(4, "Edward", 30000.0f));
		employeeList.add(new Employee(5, "Ludwig", 95000.0f));
		System.out.print("Enter the employee salary bonus: ");
		float bonus = scanner.nextFloat();
		List<Float> revisedSalaryList = employeeList.stream().map(n -> n.empSalary = n.empSalary + bonus).collect(Collectors.toList());
		int n = 0;
		for(Employee e : employeeList)
		{
			e.empSalary = revisedSalaryList.get(n);
			n++;
			System.out.println(e.getEmpNo() + " " + e.getEmpName() + " " + e.empSalary);
		}
	}
}