package lesson1;

public class Person {
	
	String name;
	String lastName;
	double mark;
	
	public Person(String name, String lastName, double mark) {
		this.name = name;
		this.lastName = lastName;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [Name=" + getName() + ", LastName=" + getLastName() + ", Mark=" + getMark() + "]";
	}
	
	

}
