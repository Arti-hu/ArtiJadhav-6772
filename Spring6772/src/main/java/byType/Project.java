package byType;

public class Project 
{
   String ProjectName;

public String getProjectName() {
	return ProjectName;
}

public void setProjectName(String projectName) {
	ProjectName = projectName;
}

public Project() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Project [ProjectName=" + ProjectName + "]";
}
   
}
