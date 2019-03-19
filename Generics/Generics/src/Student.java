
public class Student <T> {
	private T grade;
	// student id
	// first name
	// flags
	
	public Student (T grade)
	{
		this.grade = grade;
	}
	
	// getter
	public T getGrade ()
	{
		return this.grade;
	}
}
