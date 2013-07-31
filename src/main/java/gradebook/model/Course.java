package gradebook.model;
import java.util.List;

public class Course {
    private int courseNum;
    private String subject;
    private String courseName;
    private List<Course> preReqs;

    public void setCourseNumber(int num) {
        courseNum = num;
    }
    public void setSubject(String subjectName) {
        subject = subjectName;
    }
    public void setCourseName(String name) {
        courseName = name;
    }
    public void addPreRequisites(Course c) {
        preReqs.add(c);
    }
    public int getCourseNumber() {
        return courseNum;
    }
    public String getSubject() {
        return subject;
    }
    public String getCourseName() {
        return courseName;
    }
    public List<Course> getPreRequisites() {
        return preReqs;
    }

}
