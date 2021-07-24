package StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsByName;

    public StudentSystem()
    {
        this.studentsByName = new HashMap<>();
    }

    public Map<String, Student> getStudentsByName() {
        return this.studentsByName;
    }

    public String ParseCommand(String[] args)
    {
        String output = null;
        String command = args[0];
        if (command.equals("Create")) {
            addStudent(createStudent(args));
        }
        else if (command.equals("Show")) {
            var name = args[1];
            if (studentsByName.containsKey(name)) {
                Student student = studentsByName.get(name);
               output = student.toString();
            }
        }
        return output;
    }

    private boolean contains(String name){
        return this.studentsByName.containsKey(name);
    }

    public void addStudent(Student student)
    {
        if (!contains(student.getName())) {
           studentsByName.put(student.getName(),student);
        }
    }

    public Student createStudent(String[] args)
    {
        var name = args[1];
        var age = Integer.parseInt(args[2]);
        var grade =Double.parseDouble(args[3]);
        return new Student(name,age,grade);
    }

}
