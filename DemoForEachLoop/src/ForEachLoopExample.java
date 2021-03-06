import java.util.ArrayList;
import java.util.List;

public class ForEachLoopExample {
	
	public static void main(String[] Args){
		
		List<Student> students = new ArrayList<Student>();
		
		Student student1 = new Student("Daffy", "Duck", 12);
		Student student2 = new Student("Daisey", "Duck", 11);
		Student student3 = new Student("Mickey", "Mouse", 11);
		Student student4 = new Student("Minnie", "Mouse", 10);
		Student student5 = new Student("Goofy", "Snow", 9);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		for(Student student : students){
			System.out.println(student.toString());
		}
		
		for(Student student : students){
			if(student.getGradeLevel() == 12){
				System.out.println(
						String.format("Congratulations %s! You are a senior.", student.getFullName())
						);
			}
		}
		
		students
			.stream()
			.filter(s->s.getLastName()
					.equals("Mouse"))
					.forEach(s -> System.out.println(s.toString()));
	}
}
