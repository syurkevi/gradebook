import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import gradebook.model.*;
import java.util.LinkedList;

public class studentTest { 
    private Student<Integer> s=new Student<Integer>("Neo");

    @Test
    public void testName(){
        assertEquals(s.getName(),"Neo");
    }

    @Test
    public void testScheme(){
        assertTrue(s.getCurrentGradingScheme() instanceof LazyGrader);
    }

    @Test
    public void testAverage(){
        s.addGradebookItem(new GradebookItem<Integer>(100,null));
        s.addGradebookItem(new GradebookItem<Integer>(100,null));
        s.addGradebookItem(new GradebookItem<Integer>(100,null));
        assertEquals((Integer)s.averageGrade(),(Integer)100);
    }
    
    @Test
    public void testLetter(){
        s.addGradebookItem(new GradebookItem<Integer>(10,null));
        s.addGradebookItem(new GradebookItem<Integer>(100,null));
        s.addGradebookItem(new GradebookItem<Integer>(9001,null));
        assertEquals(s.averageLetterGrade(),'a');
    }
}
