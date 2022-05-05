package nnp1;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Class1 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int classId;
	
	@Column
	String ClassName;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Student11> student;

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}

	public List<Student11> getStudent() {
		return student;
	}

	public void setStudent(List<Student11> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Class1 [classId=" + classId + ", ClassName=" + ClassName + ", student=" + student + "]";
	}
	
	
}
