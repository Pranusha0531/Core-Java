package lists;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;
public class ConversionTest {
        @Test
        public void testConvert_ToArray() {
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Apple");
            stringList.add("Banana");
            stringList.add("Orange");
            String[] result = Conversion.conversion(stringList);
            assertNotNull(result);
            assertEquals(stringList.size(), result.length);
            assertArrayEquals(stringList.toArray(new String[0]), result);
        }

        @Test
        public void testEmptyList() {
            ArrayList<String> emptyList = new ArrayList<>();
            String[] result = Conversion.conversion(emptyList);
            assertNotNull(result);
            assertEquals(0, result.length);
        }
    }
