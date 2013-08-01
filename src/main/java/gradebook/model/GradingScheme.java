package gradebook.model;
import java.util.List;

/*
 * Defines an abstract grading strategy
 */
public abstract class GradingScheme<T>  {
    abstract T grade(List<GradebookItem<T>> grades);
    abstract char letterGrade(List<GradebookItem<T>> grades);
}
