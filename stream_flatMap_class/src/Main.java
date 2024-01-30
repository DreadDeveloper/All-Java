import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args)
	{
		List<Employee> police = Arrays.asList(
			new Employee(101, "Fernando Alonso", "Commissioner", 12500.0f),
			new Employee(102, "Carlos Sainz", "Captain", 10000.0f),
			new Employee(103, "Lando Norris", "Rookie", 7500.0f)
		);
		List<Employee> medical = Arrays.asList(
			new Employee(891, "Tatiana Calderon", "Oncologist", 45000.0f),
			new Employee(892, "Lewis Hamilton", "Administrator", 90000.0f),
			new Employee(893, "George Russel", "Nurse Practitioner", 25000.0f)
		);
		List<List<Employee>> employeeList = new ArrayList<>();
		employeeList.add(police);
		employeeList.add(medical);
		List<Employee> revisedEmployeeList = employeeList.stream().flatMap(Collection::stream).collect(Collectors.toList());
		for(Employee e : revisedEmployeeList)
		{
			System.out.println(e.empID + " " + e.empName + " " + e.designation + " " + e.empSalary);
		}
	}
}