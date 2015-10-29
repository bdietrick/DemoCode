
public class Student {
	private String firstName;
	private String lastName;
	private int gradeLevel;
	
	public Student(String FirstName, String LastName, int GradeLevel){
		firstName = FirstName;
		lastName = LastName;
		gradeLevel = GradeLevel;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String FirstName){
		firstName = FirstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String LastName){
		lastName = LastName;
	}
	
	public String getFullName(){
		return String.format("%s %s", firstName, lastName);
	}
	
	public int getGradeLevel(){
		return gradeLevel;
	}
	
	public void setGradeLevel(int GradeLevel){
		gradeLevel = GradeLevel;
	}
	
	public String toString(){
		return String.format("Last Name: %s *** First Name: %s *** Grade Level: %d", lastName, firstName, gradeLevel);
	}
}
