package cecchin.classObjects;

public class Student {
	// Create a Student class that stores a student’s first name, last name, id
	// (String), grade (int), and age. Include getters and setters for all
	// attributes. Ensure that when names are set that they are not empty or null.
	// Ensure that when the grade is set, that it is in the range [9,12]. If
	// constraints are violated, print an error message to the screen. Create a
	// toString() method that prints the details for a specific student. In the
	// Main() program, create 3 students, setting their attributes, and display
	// their information to the screen.

	private String fName;
	private String lName;
	private String id;
	private int grade;
	private int age;

	public String getfName() {
		return fName;
	}

	public void setfName(String fN) {
		if (fN == null || fN == "") {
			System.out.println("INVALID");
		} else {
			fName = fN;
		}
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lN) {
		if (lN == null || lN == "") {
			System.out.println("INVALID");

		} else {
			lName = lN;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String iD) {
		id = iD;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int gr) {
		if (gr < 9 || gr > 12) {
			System.out.println("INVALID");

		} else {
			grade = gr;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int ag) {
		age = ag;
	}

}
