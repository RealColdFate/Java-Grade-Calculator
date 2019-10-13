

public class main{

    public static void main(String[] args) {

    Student studentOne = new Student("James");
    Class classOne = new Class("Math");
    ClassField classFieldOne = new ClassField("Homework", 100);
    Assignment assignmentOne = new Assignment("homework A", 69.420);

    studentOne.addClass(classOne);
    classOne.addClassField(classFieldOne);
    classFieldOne.addAssignment(assignmentOne);

    System.out.println(studentOne.getAverage());






    }
}