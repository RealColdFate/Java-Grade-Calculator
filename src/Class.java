import java.util.ArrayList;


public class Class  {

    private double average;
    private String name;
    private ArrayList<ClassField> classFields;

    public Class() {
        this.average = 0.0;
        this.name = "No name set";
        this.classFields = new ArrayList<ClassField>();
    }

    public Class(String name) {
        setName(name);
        this.average = 0.0;
        this.classFields = new ArrayList<ClassField>();
    }


    public ArrayList<ClassField> getClassFields() {
        return classFields;
    }

    public void setClassFields(ArrayList<ClassField> classFields) {
        this.classFields = classFields;
    }


    // TODO fix average to work with weight
    public double getAverage() {
        double sum = 0;
        for (ClassField f : this.classFields)
            sum += f.getAverage() * (10 * f.getWeight());
        average = sum / this.classFields.size();

        return  average;
    }

    public boolean isEqual(Class c) {
      return this.getName() == c.getName();
    }

    public void updateAverage() {
      this.average = getAverage();
    }


    public void addClassField(String name, double weight) {
        this.classFields.add(new ClassField(name, weight));

    }

    public void addClassField(ClassField newClassField) {
        this.classFields.add(newClassField);
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
}
