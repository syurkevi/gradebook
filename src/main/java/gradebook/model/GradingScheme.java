package gradebook.model;
import java.util.List;

/**
 * Defines an abstract grading strategy
 *@param <T> unit of grading
 */
public abstract class GradingScheme<T>  {
    abstract T grade(List<GradebookItem<T>> grades);
    abstract char letterGrade(List<GradebookItem<T>> grades);
}
