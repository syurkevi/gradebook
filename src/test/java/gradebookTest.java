import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import gradebook.model.*;

public class gradebookTest{
    private GradebookCategory category=new GradebookCategory(1,"Wrecking");
    private GradebookItem item=new GradebookItem(42,category);

    @Test
    public void testGrade(){
        assertEquals(item.getGrade(),42);
    }
    @Test
    public void testCategory(){
        assertEquals(item.getCategory().getName(),"Wrecking");
    }   
    @Test
    public void testCategoryWeight(){
        assertEquals(item.getCategory().getWeight(),1);
    }   

}
