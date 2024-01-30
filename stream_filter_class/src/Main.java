import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
	public static void main(String[] args)
	{
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "AS", 32.0f));
		studentList.add(new Student(2, "SK", 99.0f));
		studentList.add(new Student(3, "NA", 90.0f));
		studentList.add(new Student(4, "AA", 100.0f));
		studentList.add(new Student(5, "DB", 101.0f));
		studentList.add(new Student(6, "AK", 99.0f));
		studentList.add(new Student(7, "AP", 98.0f));
		studentList.add(new Student(8, "P", 97.0f));
		studentList.add(new Student(9, "AR", 96.0f));
		studentList.add(new Student(10, "JA", 95.0f));
		studentList.add(new Student(11, "AK", 94.0f));
		//Using forEach
		studentList.stream().filter(n -> n.getRollNo() > 5).forEach(n -> System.out.println(n.getRollNo() + "  " + n.getStudentName() + ' ' + n.getAvgMarks()));
		//Using Collectors
		List<Student> rollList = studentList.stream().filter(n -> n.getRollNo() > 5).collect(Collectors.toList());
		for(Student n : rollList)
		{
			System.out.println(n.getRollNo() + " " + n.getStudentName() + " " + n.getAvgMarks());
		}
	}
}