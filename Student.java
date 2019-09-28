package lesson1;

import java.util.Arrays;

public class Student {

	Person[] person = new Person[100];
	int currentIndex = 0;

	public void addStudent(Person p) {
		person[currentIndex] = p;
		currentIndex++;
	}

	public Person[] allStudents() {
		return Arrays.copyOf(person, currentIndex);
	}

	public int numberOfStudents() {
		return currentIndex;
	}

	public Person[] findStudentsByName(String name) {
		Person[] result = new Person[currentIndex];
		int index = 0;
		for (int i = 0; i < currentIndex; i++) {
			if (person[i].getName().equals(name)) {
				result[index] = person[i];
				index++;
			}
		}
		return Arrays.copyOf(result, index);
	}

	public int numberOfStudentsByName(String name) {
		Person[] result = new Person[currentIndex];
		int index = 0;
		for (int i = 0; i < currentIndex; i++) {
			if (person[i].getName().equals(name)) {
				result[index] = person[i];
				index++;
			}
		}
		return index;
	}

	public double averageMark() {
		double average = 0;
		for (int i = 0; i < currentIndex; i++) {
			average = average + person[i].getMark();
		}
		return average / currentIndex;
	}
}
