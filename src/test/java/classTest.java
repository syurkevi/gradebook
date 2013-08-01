import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import gradebook.model.*;
import java.util.LinkedList;

public class classTest { 
    private ClassGrd c=new ClassGrd();
    
    @Before
    public void setAll(){
        Course tCourse=new Course();
        tCourse.setCourseName("drownproofing 101");
        c.setCourse(tCourse);

        Student s=new Student("G. P. Burdell");
        s.addGradebookItem(new GradebookItem(100, new GradebookCategory(1,"Category Test")));
        s.addGradebookItem(new GradebookItem(50, new GradebookCategory(1,"Category Test")));
        c.addStudent(s);
        
        Student s1=new Student("Buzz");
        s1.addGradebookItem(new GradebookItem(50, new GradebookCategory(1,"Category Test")));
        s1.addGradebookItem(new GradebookItem(100, new GradebookCategory(1,"Category Test")));
        c.addStudent(s1);

        Section sec=new Section();
        c.addSection(sec);

    }

    @Test
    public void testCourse(){
        assertEquals(c.getCourse().getCourseName(),"drownproofing 101");
    }

    @Test
    public void testStudents(){
        assertEquals(((Student) c.getStudents().remove(0)).getName(),"G. P. Burdell");
    }

    @Test
    public void testSections(){
        assertNotNull(c.getSections().remove(0));
    }

    @Test
    public void testScheme(){
        assertTrue(c.getCurrentGradingScheme() instanceof LazyGrader);
    }

    @Test
    public void testAverage(){
        assertEquals(c.averageGrade(),75);
    }
    
    @Test
    public void testLetter(){
        assertEquals(c.averageLetterGrade(),'b');
    }
}
