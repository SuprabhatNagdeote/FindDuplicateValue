import java.util.HashSet;
import java.util.Set;

public class DuplicateValueFindClass {
    public static void main(String[] args) {
        //By using Set Interface.

        String stringArray[] = {"java", "c", "python", "java", "suprabhat", "c", "suprabhat"};
        Set<String> duplicateValue = new HashSet<String>();

        for (String e : stringArray) {
            if (duplicateValue.add(e) == false) {
                System.out.println(e);
            }

        }

        System.out.println("...........................................");

        //By for loop method

        for (int i = 0; i < stringArray.length; i++) {
            for (int j =i+1; j < stringArray.length; j++) {
                if (stringArray[i].equals(stringArray[j])) {

                    System.out.println(stringArray[i]);

                }

            }
        }
    }
}