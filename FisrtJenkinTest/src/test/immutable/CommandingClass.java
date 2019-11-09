package test.immutable;

public class CommandingClass {

    public static void main(String[] args) {
	Student student = new Student("Pradee", 10);
	System.out.println(student.getId());
	// student.id=20;//The final field Student.id cannot be assigned
    }

}
