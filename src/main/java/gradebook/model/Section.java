package gradebook.model;
import java.util.LinkedList;
import java.util.List;

public class Section<T> implements Grading<T> {
    private List<Student> enrolled;
    private GradingScheme sectionScheme = new LazyGrader("Category 1");

    public List<Student> getStudents() {
        return enrolled;
    }

    public void addStudent(Student s) {
        enrolled.add(s);
    }

    public GradingScheme<T> getCurrentGradingScheme() {
        return sectionScheme;
    }

    public void setGradingScheme(GradingScheme<T> scheme) {
        sectionScheme = scheme;
    }

    public T averageGrade() {
        List<GradebookItem<T>> sgrades = new LinkedList<GradebookItem<T>>();
        for (Student<T> s : enrolled) {
            sgrades.addAll(s.getGradebookItems());
        }
        return (T) sectionScheme.grade(sgrades);
    }
    public char averageLetterGrade() {
        List<GradebookItem<T>> sgrades = new LinkedList<GradebookItem<T>>();
        for (Student<T> s : enrolled) {
            sgrades.addAll(s.getGradebookItems());
        }
        return sectionScheme.letterGrade(sgrades);
    }

}
