package gradebook.model;
import java.util.List;
import java.util.LinkedList;

/**
 * A class inplementing a student
 * @param <T> type of grades the student receives
 */
public class Student<T> implements Grading<T> { //leaf in grading
    private String name;
    private GradingScheme<T> currentScheme =
        (GradingScheme<T>) new LazyGrader("Category 1");
    private List<GradebookItem<T>> gradebook =
        new LinkedList<GradebookItem<T>>();

    public Student(String studentName) {
        name = studentName;
    }

    public String getName() {
        return name;
    }

    public GradingScheme<T> getCurrentGradingScheme() {
        return currentScheme;
    }

    public void setGradingScheme(GradingScheme<T> scheme) {
        currentScheme = scheme;
    }

    public void setName(String studentName) {
        name = studentName;
    }

    public List<GradebookItem<T>> getGradebookItems() {
        return gradebook;
    }

    public void addGradebookItem(GradebookItem<T> grade) {
        gradebook.add(grade);
    }

    public T averageGrade() {
        return currentScheme.grade(gradebook);
    }
    public char averageLetterGrade() {
        return currentScheme.letterGrade(gradebook);
    }
}
