package streammethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorted
public class StreamMethods2Demo1 {
    public static void main(String[] args) {

        //Integers
        List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);

        List<Integer> sortedlist = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist); //ascending order

        List<Integer> reverseSortedList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedList);//descending order

        //Strings
        List<String> list2 = Arrays.asList("John" ,"Mary" , "Kim" ,"David" , "Smith");

        List<String> sortedlist2 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist2); //ascending order

        List<String> reverseSortedList2 = list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedList2);

    }
}
