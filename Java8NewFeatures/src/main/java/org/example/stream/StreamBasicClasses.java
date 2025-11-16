package org.example.stream;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamBasicClasses {

    public static void main(String []args){

    List<Integer> numbers = List.of(1, 4, 3, 34, 55, 333, 5555, 334, 6654, 4343);

    //Basic Stream Intermediate Opearations :

        Predicate<Integer> evenNumbers = number -> number %2==0;
        Predicate<Integer> oddNumbers = number -> number %2!=0;

        Function<Integer , Integer> squaresOfNumbers = number -> number * number;

        Comparator<Integer> sortedOrder = Comparator.naturalOrder();
        Comparator<Integer> reverseOrder = Comparator.reverseOrder();

        List<Integer> eveNumbers = numbers.stream()
                .filter(evenNumbers)
                .toList();

        System.out.println("Even numbers are : " + eveNumbers);


        List<Integer> listOfOddNumbers = numbers.stream()
                .filter(oddNumbers)
                .toList();

        System.out.println("Odd  numbers are : " + listOfOddNumbers);

        List<Integer> listOfSquares = numbers.stream()
                .map(squaresOfNumbers)
                .toList();

        System.out.println("Squares of numbers are : " + listOfSquares);

        List<Integer> ascendingOrder = numbers.stream()
                .sorted(sortedOrder)
                .toList();

        System.out.println(" Ascending Order is  : " + ascendingOrder);

        List<Integer> descendingOrder = numbers.stream()
                .sorted(reverseOrder)
                .toList();

        System.out.println(" Descending  Order is  : " + descendingOrder);
}

}
