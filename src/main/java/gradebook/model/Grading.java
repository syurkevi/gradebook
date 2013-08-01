package gradebook.model;

/**
 * An interface representing a grading component
 *@param <T> unit of grading
 */
public interface Grading<T>  {
    T averageGrade();
    char averageLetterGrade();
}
