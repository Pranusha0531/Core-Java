package lists;
import java.util.ArrayList;
public class Conversion {


        public static String[] conversion(ArrayList<String> stringList) {
            String[] stringArray = stringList.toArray(new String[0]);
            System.out.println("Array elements:");
            for (String element : stringArray) {
                System.out.println(element);
            }
            return stringArray;
        }
    }

