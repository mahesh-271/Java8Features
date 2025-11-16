package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class BuiltInFunctionalInterface {

    public static void main(String []args) {


        //Function Build in Functional Interfaces :

        Function<Integer , Integer> mult = value -> value * 2;

        System.out.println("addition is :  " + mult.apply(12));

        Function<String , Integer> fv = names -> names.length();

        int appliedResult = fv.apply("Mahesh");


        BiFunction<Integer, Integer, Integer> addition1 = (a, b)-> a + b;

        System.out.println("data after biFunction : " +  addition1.apply(10 , 20));

    //    --------------------------------------------------
        //Predicate Functional Interfaces

        Predicate<Integer> even = number -> number % 2 == 0;

        System.out.println("Result is :" +  even.test(10));

        //-----------------------------------------------

        //Consumer Functional Interface : ---

        Consumer<String> values = System.out::println;

        values.accept("Mahesh");

        //----------------------------------------------------

        //Supplier Functional Interface :

        Supplier<String> stringSupplier = ()-> "Hi Mahesh";

        Supplier <Integer> resultedNumbers = ()->  12*20;

        int resultedSupplierValues = resultedNumbers.get();

        System.out.println("MultiPlicationWithSupplier" + resultedSupplierValues);

        System.out.println("Supplier Result is " + stringSupplier);

        //------------------------------------------------------


   //  ---//   ----------------------------------------------------------

        //Using  built in  Interfaces ;

        List<Integer> numbersList = Arrays.asList(12,32,2,4,5,5,8,7);


        System.out.println("Applied Result is :" + appliedResult);

      List<Integer> resultNumbers = numbersList.stream()
                .filter(even)
                .map(mult)
                .toList();

        System.out.println("ResultNumbers are :" + resultNumbers);

        //-----------------------------------------------



    }
}
