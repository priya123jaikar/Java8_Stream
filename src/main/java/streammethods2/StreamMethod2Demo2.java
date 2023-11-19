package streammethods2;

//anyMatch()
//allMatch()
//noneMatch()

import java.util.HashSet;
import java.util.Set;

public class StreamMethod2Demo2 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<String>();

        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");

        //anyMatch() // any of the value should start with one
        boolean result = fruits.stream().anyMatch(value -> {return  value.startsWith("One");});
        System.out.println(result);

        //allMatch() // every value should start with one
        boolean result1 = fruits.stream().allMatch(value -> {return  value.startsWith("One");});
        System.out.println(result1);

        //noneMatch //none of the elements should start with one
        boolean result3 = fruits.stream().noneMatch(value -> {return  value.startsWith("One");});
        System.out.println(result3);

    }
}
