import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import gradebook.model.*;
import java.util.LinkedList;

public class sectionTest { 
    private Student<Integer> s1=new Student<Integer>("Erich");
    private Student<Integer> s2=new Student<Integer>("Richard");
    private Student<Integer> s3=new Student<Integer>("Ralph");
    private Student<Integer> s4=new Student<Integer>("John");
   
    private Section a1=new Section();

    @Before
    public void addStudents(){
        s1.addGradebookItem(new GradebookItem<Integer>(90,null));
        s2.addGradebookItem(new GradebookItem<Integer>(95,null));
        s3.addGradebookItem(new GradebookItem<Integer>(95,null));
        s4.addGradebookItem(new GradebookItem<Integer>(100,null));
        a1.addStudent(s1);
        a1.addStudent(s2);
        a1.addStudent(s3);
        a1.addStudent(s4);
    }

    @Test
    public void testNames(){
        List<Student<Integer>> sectionStudents=a1.getStudents();
        assertTrue(sectionStudents.contains(s1));
        assertTrue(sectionStudents.contains(s2));
        assertTrue(sectionStudents.contains(s3));
        assertTrue(sectionStudents.contains(s4));
    }

    @Test
    public void testScheme(){
        assertTrue(a1.getCurrentGradingScheme() instanceof LazyGrader);
    }

    @Test
    public void testAverage(){
        assertEquals((Integer)a1.averageGrade(),(Integer)95);
    }
    
    @Test
    public void testLetter(){
        assertEquals(a1.averageLetterGrade(),'a');
    }
}
