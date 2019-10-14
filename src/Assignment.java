public class Assignment  {
    private String name;
    private double average;

    public Assignment(String name, double grade) {
        setName(name);
        setAverage(grade);
    }


    public double getAverage() {
        return this.average;
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
    public boolean isEqual(Assignment assignment) {
      return this.getAverage() == assignment.getAverage() && this.getName() == assignment.getName();
    }


}
