package org.example.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StringsWithStream {

    public static void main(String []args){

        List<String> stringList = Arrays.asList("Mahesh" , "Edwin" ,"John", "Messi", "Ronaldo");

    List<String> nameStartsWithM =   stringList.stream()
                .filter(name -> name.startsWith("Mahesh"))
                .toList();

        System.out.println("Filtering out names starts with M " + nameStartsWithM);


     List<String> filteringNamesBasedOnLength =    stringList.stream()
                .filter(name -> name.length()> 5)
                .toList();

        System.out.println("Odd numbers : "+ filteringNamesBasedOnLength);
}

}
