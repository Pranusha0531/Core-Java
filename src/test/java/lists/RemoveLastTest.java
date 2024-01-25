package lists;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class RemoveLastTest {
        @Test
        public void testRemoveObject() {
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("A");
            stringList.add("B");
            stringList.add("C");
            ArrayList<String> result = RemoveLast.removeObject(stringList);
            assertNotNull(result);

        }
        @Test
        public void testRemoveObjectEmptyList() {
            ArrayList<String> emptyList = new ArrayList<>();
            ArrayList<String> result = RemoveLast.removeObject(emptyList);
            assertNotNull(result);
            assertEquals(0, result.size());
        }
    }

