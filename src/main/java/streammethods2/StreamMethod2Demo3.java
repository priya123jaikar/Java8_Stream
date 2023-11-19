package streammethods2;

//findAny()
//findFirst()

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethod2Demo3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one" , "two" , "three" , "one");

        //findAny
        Optional<String> ele = stringList.stream().findAny();
        System.out.println(ele.get());

        //findFirst
        Optional<String> ele1 = stringList.stream().findFirst();
        System.out.println(ele1.get());

    }
}
