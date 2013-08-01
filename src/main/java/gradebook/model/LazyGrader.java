package gradebook.model;
import java.util.List;

/**
 * implements a concrete grading strategy
 */
public class LazyGrader extends GradingScheme<Integer> {
    private String gradingCategory;
    private final int threshold = 80;

    public LazyGrader(String category) {
        gradingCategory = category;
    }

    public Integer grade(List<GradebookItem<Integer>> grades) {
        if (grades.size() < 1) {
            return -1;
        }
        Integer sum = 0;
        for (GradebookItem<Integer> g : grades) {
            if (g.getCategory() == null
                    || g.getCategory().getName().equals(gradingCategory)) {
                sum += g.getGrade();
            }
        }
        return sum / grades.size();
    }
    public char letterGrade(List<GradebookItem<Integer>> grades) {
        char lGrade;
        System.out.println(grade(grades));
        if (grade(grades) > threshold) {
            lGrade = 'a';
        } else {
            lGrade = 'b';
        }
        return lGrade; //this whole function could have been 1 line and clear
        //if it wasn't for avoidInlineConditionals >_>
    }

}
