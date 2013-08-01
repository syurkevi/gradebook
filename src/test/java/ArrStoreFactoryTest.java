import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import gradebook.model.*;

public class ArrStoreFactoryTest {
   
    AbstractStoringFactory<Integer> aFac=new ArrayStoringFactory<Integer>();
    
    @Test
    public void testFactory(){
        assertEquals(((ArrayDataStore<Integer>) aFac.getObjectStore()).backingArraySize(),10);
        assertEquals(((ArrayDataStore<Integer>)aFac.getObjectStore("large")).backingArraySize(),1000);
    }

}
