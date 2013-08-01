package gradebook.model;

/*
 * An interface representing a grading component
 */
public interface Grading<T>  {
    T averageGrade();
    char averageLetterGrade();
}
