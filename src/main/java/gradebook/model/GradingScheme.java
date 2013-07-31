package gradebook.model;
import java.util.List;

public interface GradingScheme<T>  {
    T grade(List<GradebookItem<T>> grades);
    char letterGrade(List<GradebookItem<T>> grades);
}
