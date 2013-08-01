package gradebook.model;
import java.util.List;
import java.util.LinkedList;

/*
 *A class object implements an instance of a course
 *it also is an implementation of the "grading" composite object
 */
public class Class<T> implements Grading<T> { //composite
    private Course course;
    private List<Student> enrolled = new LinkedList<Student>();
    private List<Section> sections = new LinkedList<Section>();
    private GradingScheme classScheme = new LazyGrader("Category 1");

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

    public GradingScheme<T> getCurrentGradingScheme() {
        return classScheme;
    }

    public void setGradingScheme(GradingScheme<T> scheme) {
        classScheme = scheme;
    }

    public T averageGrade() {
        List<GradebookItem<T>> cgrades = new LinkedList<GradebookItem<T>>();
        for (Student<T> s : enrolled) {
            cgrades.addAll(s.getGradebookItems());
        }
        return (T) classScheme.grade(cgrades);
    }
    public char averageLetterGrade() {
        List<GradebookItem<T>> cgrades = new LinkedList<GradebookItem<T>>();
        for (Student<T> s : enrolled) {
            cgrades.addAll(s.getGradebookItems());
        }
        return classScheme.letterGrade(cgrades);
    }

}
