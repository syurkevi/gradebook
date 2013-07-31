package gradebook.model;

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
