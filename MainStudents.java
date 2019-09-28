package lesson1;

public class MainStudents {

	public static void main(String[] args) {

		Student student = new Student();
		student.addStudent(new Person("Yuliya", "Denysenko", 7.5));
		student.addStudent(new Person("Inna", "May", 10.5));
		student.addStudent(new Person("Olga", "Fox", 9.6));
		student.addStudent(new Person("Max", "Snizok", 5.9));
		student.addStudent(new Person("Yuliya", "Ivanenko", 11.5));
		student.addStudent(new Person("Roman", "Rogovets", 8.7));

		System.out.println("Number of students");
		System.out.println(student.numberOfStudents());
		System.out.println();

		Person[] person = student.allStudents();
		show(person);
		System.out.println();

		System.out.println("Number of student by name");
		System.out.println(student.numberOfStudentsByName("Yuliya"));
		person = student.findStudentsByName("Yuliya");
		show(person);
		System.out.println();
		
		System.out.println("Average mark all students");
		System.out.println(student.averageMark());
		System.out.println();

	}

	public static void show(Person[] p) {
		for (Person x : p) {
			System.out.println(x);
		}
	}

}
