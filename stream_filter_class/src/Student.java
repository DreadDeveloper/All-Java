public class Student
{
	private final int rollNo;
	private final String studentName;
	private final float avgMarks;
	Student(int rollNo, String studentName, float avgMarks)
	{
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.avgMarks = avgMarks;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public float getAvgMarks()
	{
		return avgMarks;
	}
}
