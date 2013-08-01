import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import gradebook.model.*;

public class courseTest{
    private Course course=new Course();
    private Course course1=new Course();

    @Before
    public void initPrereqs(){
        course1.setCourseName("test course");
    }

    @Test
    public void testCourseNumber() {
        course.setCourseNumber(123);
        assertEquals(course.getCourseNumber(),123);
    }
    @Test
    public void testSubject() {
        course.setSubject("Math");
        assertEquals(course.getSubject(),"Math");
    }
    @Test
    public void testName() {
        course.setCourseName("discrete topology");
        assertEquals(course.getCourseName(),"discrete topology");
    }
    @Test
    public void testPrereqs() {
        course.addPreRequisites(course1);
        assertEquals(course.getPreRequisites().remove(0).getCourseName(),"test course");
    }
}
