import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> courses;

    public Student(String name, String id, String email) {
        super(name, id, email);
        courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    @Override
    public String getDetails() {
        return "----- STUDENT -----\n" +
               "Name: " + getName() + "\n" +
               "ID: " + getId() + "\n" +
               "Email: " + getEmail() + "\n" +
               "Courses: " + courses + "\n";
    }
}
