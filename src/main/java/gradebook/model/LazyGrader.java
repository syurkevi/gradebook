package gradebook.model;
import java.util.List;

/*
 * implements a concrete grading strategy
 */
public class LazyGrader extends GradingScheme<Double> {
    private String gradingCategory;
    private final int threshold = 80;

    public LazyGrader(String category) {
        gradingCategory = category;
    }

    public Double grade(List<GradebookItem<Double>> grades) {
        if (grades.size() < 1) {
            return -1.0;
        }
        double sum = 0;
        for (GradebookItem<Double> g : grades) {
            if (g.getCategory().getName().equals(gradingCategory)) {
                sum += g.getGrade();
            }
        }
        return sum / grades.size();
    }
    public char letterGrade(List<GradebookItem<Double>> grades) {
        char lGrade;
        if (grade(grades) > threshold) {
            lGrade = 'a';
        } else {
            lGrade = 'b';
        }
        return lGrade; //this whole function could have been 1 line and clear
        //if it wasn't for avoidInlineConditionals >_>
    }

}
