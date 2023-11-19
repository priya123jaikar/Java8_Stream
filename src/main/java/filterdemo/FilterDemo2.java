package filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre" , "Sansa" , "Jon" , "Darenerys" , "Joffery");

        //storing data in another collection
        List<String>longnames = new ArrayList<>();
        longnames=names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
        System.out.println(longnames);

        //storing data in same collection
        names.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));

        //OR without passing argument to system.out.println()
        names.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);



    }
}
