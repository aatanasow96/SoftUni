package Objects_and_Classes.Exercise.OrderByAge_07;

public class People {
    private final String name;
    private final String ID;
    private final int age;

    public People(String name, String ID, int age){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return String.format("%s with ID: %s is %d years old.", name, ID, age);
    }
}