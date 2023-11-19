package mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(2,3,4,5);
        List<Integer> multipliedList = new ArrayList<Integer>();

        //Before Java8
        for (int num : numbersList)
        {
            multipliedList.add(num*3);
        }
        System.out.println(multipliedList);


        //using streams
        multipliedList = numbersList.stream().map(num -> num*3).collect(Collectors.toList());
        System.out.println(multipliedList);
    }
}
