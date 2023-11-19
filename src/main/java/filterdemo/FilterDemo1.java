package filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {

        //method1 to add the data in the arraylist
        ArrayList<Integer> numberList = new ArrayList<Integer>(); //declaring the collections
        numberList.add(10); //adding data to the collections
        numberList.add(15);
        numberList.add(20);
        numberList.add(25);
        numberList.add(30);

        //method2 to add the data in the arraylist

        List<Integer> numberList1 = Arrays.asList(10,15,20,25,30);

        //now filter only even numbers from the list

        List<Integer> evenNumberList = new ArrayList<>(); //creating a empty collections

        //without using streams

        for (int n:numberList1)
        {
            if(n%2==0)
                evenNumberList.add(n);
        }
        System.out.println(evenNumberList);


        //with stream concept

        evenNumberList=numberList1.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumberList);

        //OR directly printing the value without storing it into some other collections

        numberList1.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));

        //OR without passing argument to system.out.println()

        numberList1.stream().filter(n->n%2==0).forEach(System.out::println);





    }
}
