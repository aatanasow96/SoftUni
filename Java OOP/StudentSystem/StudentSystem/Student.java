package StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String toString(){
        String output = String.format("%s is %s years old. %s",getName(),getAge(),getStudentResultMessage());

        return output;
    }

    private String getStudentResultMessage(){
        if (getGrade() >= 5.00) {
            return "Excellent student.";
        }
        else if (getGrade() >= 3.50) {
            return "Average student.";
        }
            return "Very nice person.";
    }
}
