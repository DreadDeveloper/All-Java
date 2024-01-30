import java.util.ArrayList;
import java.util.function.Predicate;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Employee> employeeArrayList = new ArrayList<>();
		Predicate<Employee> salaryPredicate= e -> (e.getSalary() > 50000.0f);
		Predicate<Employee> experiencePredicate= e -> (e.getExperience() > (short)5);
		employeeArrayList.add(new Employee(1, "Jeremy Clarkson", 150000.0f, (short)20));
		employeeArrayList.add(new Employee(2, "Soviet Womble", 50000.0f, (short)7));
		employeeArrayList.add(new Employee(3, "Donald Trump", 500000.0f, (short)30));
		employeeArrayList.add(new Employee(4, "Me", 0.0f, (short)0));
		employeeArrayList.add(new Employee(5, "You", -150000.0f, (short)-20));
		for(Employee employee: employeeArrayList)
		{
			/*if(salaryPredicate.and(experiencePredicate).test(employee))
			{
				System.out.println(employee.getEmpId() + " " + employee.getEmpName() + " " + employee.getSalary() + " " + employee.getExperience());
			}*/
			/*if(salaryPredicate.and(experiencePredicate).test(employee))
			{
				System.out.println(employee.getEmpId() + " " + employee.getEmpName() + " " + employee.getSalary() + " " + employee.getExperience());
			}*/
			if(salaryPredicate.negate().test(employee))
			{
				System.out.println(employee.getEmpId() + " " + employee.getEmpName() + " " + employee.getSalary() + " " + employee.getExperience());
			}
		}
	}
}