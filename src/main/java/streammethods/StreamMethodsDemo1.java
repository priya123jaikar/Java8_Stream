package streammethods;

//Non-Terminal Methods or Processing Methods -> distinct() limit()
//Terminal-Methods -> count()

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsDemo1 {
    public static void main(String[] args) {
        List<String>vehiclesList= Arrays.asList("bus","car","bicycle","bus", "car","car","bike");

        //distinct method
        List<String>distinctVehicles= vehiclesList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicles); //[bus, car, bicycle, bike]

        //Or using forEach
        vehiclesList.stream().distinct().forEach(value-> System.out.println(value));

        //count method
        long count = vehiclesList.stream().distinct().count();
        System.out.println(count);

        //limit method
        List<String> limitedVehicleslist = vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited Vehicles:" + limitedVehicleslist);

    }
}
