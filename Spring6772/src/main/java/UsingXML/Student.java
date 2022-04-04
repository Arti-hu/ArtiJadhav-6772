package UsingXML;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student
{
	private int studentId;
	private String studentName;
	private String Education;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) 
	{
		this.studentId = studentId;
		System.out.println("This is my student id setter method");
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public Student(int studentId, String studentName, String education) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		Education = education;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Education=" + Education + "]";
	}
	
	public void start()
	{
		System.out.println("This is start method");
	}
	
	public void end()
	{
		System.out.println("This is end method");
	}
	

}
