import java.util.ArrayList;


public class ClassField {
    private String name;
    private double average;
    private double weight;
    private ArrayList<Assignment> assignments;

    public ClassField() {
        this.name = "no name set";
        this.average = 0.0;
        this.assignments = new ArrayList<Assignment>();
    }

    public ClassField(String name, double weight) {
        setName(name);
        setWeight(weight);
        this.average = 0.0;
        this.assignments = new ArrayList<Assignment>();
    }


    public double getAverage() {
        double sum = 0;
        for (Assignment a : this.assignments)
            sum += a.getAverage();
        average = sum / this.assignments.size();

        return average;
    }


    public void addAssignment(String name, double grade) {
        this.assignments.add(new Assignment(name, grade));

    }

    public void addAssignment(Assignment newAssignment) {
        this.assignments.add(newAssignment);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0 && weight <= 100)
            this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setAverage(double average) {
        this.average = average;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }
}
