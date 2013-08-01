package gradebook.model;

/**
 * Class that defines an actual gradebook item that students will hold
 *@param <T> unit of grading
 */
public class GradebookItem<T> {
    private String name;
    private T grade;
    private GradebookCategory category;

    public void setGrade(T newGrade) {
        grade = newGrade;
    }

    public T getGrade() {
        return grade;
    }

    public GradebookCategory getCategory() {
        return category;
    }
}
