import java.util.Scanner;

public class main {

    public static void main(String[] args) {

      Student studentOne = new Student("James");
      Class classOne = new Class("Math");
      ClassField classFieldOne = new ClassField("Homework", 100);
      Assignment assignmentOne = new Assignment("homework A", 69.420);

      studentOne.addClass(classOne);
      classOne.addClassField(classFieldOne);
      classFieldOne.addAssignment(assignmentOne);

      System.out.println(studentOne.getAverage());

      studentOne = addObjects(studentOne);



    }

    public static void pritnOptions() {
      System.out.println("These are the options: \n 1. Add Class\n 2. Add Class Field\n 3. Add Assignment\n 4. Print Data\n 0. Quit");
    }

    public static Student addObjects(Student student) {
      Scanner input = new Scanner(System.in);
      String str = "";
      int choice = 1;
      double grade = 0.0;

      while (choice != 0) {
        pritnOptions();
        choice = input.nextInt();
        input.nextLine();
        switch (choice) {
          case 0:
            break;
          case 1:
            System.out.println("What is the name of the class?");
            student.addClass(new Class(input.nextLine()));
            System.out.println("Class added.");
            break;
          case 2:  //TODO finish this 
            System.out.println("Which class would you like to add to?");
            str = input.nextLine();
            if(student.findClassByName(str) != null){
              Class c = student.findClassByName(str);
              System.out.println(c.getAverage());
            }

            break;
          case 3:

            break;
          case 4:

            break;
          default:
            System.out.println("That is not a valid option");
        }

      }
      return student;

    }

}
