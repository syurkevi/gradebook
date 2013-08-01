import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import gradebook.model.*;

public class ArrayStoreTest{
    private ArrayDataStore<Integer> db;
    @Before
    public void initdb(){
        db=new ArrayDataStore<Integer>(5);
    }

    @Test
    public void testReadWrite(){
        int testInt=42;
        db.write(2,testInt); 
        assertEquals(db.read(2),(Integer)testInt);        
    }
}
