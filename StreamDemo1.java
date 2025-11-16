package streams;

import java.util.*;
import java.util.stream.IntStream;

public class StreamDemo1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mahesh", "Edwin");


        int multiplication = IntStream.of(10, 10)
                .boxed()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Total multiplication is : " + multiplication);

        System.out.println(" ---------------------------");

        names.stream()
                .flatMap(str -> Arrays.stream(str.split("")))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("---------------------------------------------");


        IntStream.range(12, 26)
                .filter(numbers -> numbers % 2 == 0)
                .forEach(System.out::println);


        System.out.println("-----------------------------");

        IntStream.of(12, 3, 133, 13, 233, 13, 3432, 213, 4212, 43212, 33, 1)
                .filter(numbers -> numbers % 2 != 0)
                .boxed()
                .forEach(System.out::println);  

        System.out.println(" ------------------------------ ");

        IntStream.of(32)
                .boxed()
                .map(num -> num * 2)
                .forEach(result -> System.out.println(" Multiplication is : " + result));

        System.out.println(" --------------------------------");
    }
}
