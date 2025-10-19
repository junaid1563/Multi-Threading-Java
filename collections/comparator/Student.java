package DSA.DSAQuestions.multithreading.collections.comparator;

public class Student {

    private float gpa;
    private String name;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return gpa +
                ": " + name + "\n";
    }
}
