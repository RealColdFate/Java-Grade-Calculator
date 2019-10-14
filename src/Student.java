import java.util.ArrayList;

public class Student {
    private double average;
    private String name;
    private ArrayList<Class> classes;

    public Student() {
        this.name = "No name set";
        this.average = 0.0;
        this.classes = new ArrayList<Class>();
    }
    public Student(String name) {
        setName(name);
        this.average = 0.0;
        this.classes = new ArrayList<Class>();
    }

    public double getAverage() {
        double sum = 0;
        for (Class c : this.classes)
            sum += c.getAverage();
        average = sum / this.classes.size();

        return average;
    }

    public Class findClassByName(String name) {
      for (Class c : classes) {
        if (c.getName().equals(name))
          return c;
      }
      return null;
    }

    public void updateAverage() {
      this.average = getAverage();
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public void addClass(String name) {
        this.classes.add(new Class(name));
    }

    public void addClass(Class newClass) {
        this.classes.add(newClass);
    }


    // Todo add in the ability to change this to the users values
    public String getLetterGrade(double grade) {
        if (grade >= 90)
            return "A";
        else if (grade >= 86)
            return "B+";
        else if (grade >= 80)
            return "B";
        else if (grade >= 76)
            return "C+";
        else if (grade >= 70)
            return "C";
        else if (grade >= 66)
            return "D+";
        else if (grade >= 60)
            return "D";
        else {
            return "F";
        }

    }

    public boolean isEqual(Student student) {
      return this.getName() == student.getName();
    }
}
