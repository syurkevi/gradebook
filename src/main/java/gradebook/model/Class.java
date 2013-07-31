package gradebook.model;
import java.util.List;
import java.util.LinkedList;

public class Class {
    private Course course;
    private List<Student> enrolled = new LinkedList<Student>();
    private List<Section> sections = new LinkedList<Section>();

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course c) {
        course = c;
    }

    public List<Student> getStudents() {
        return enrolled;
    }

    public void addStudent(Student s) {
        enrolled.add(s);
    }

    public List<Section> getSections() {
        return sections;
    }

    public void addSection(Section s) {
        sections.add(s);
    }

    public int average() {
       return 0;
    }

    public char letterGrade() {
       return 0;
    }




}
