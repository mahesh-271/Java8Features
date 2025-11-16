package org.example.stream;

import java.util.Optional;

public class OptionalClassFeature {

    public static void main(String []args){

        //the value could not be null , if it is null , it will throws null pointer exception

        Optional<String> name  = Optional.of("Mahesh");

    /*   Optional<String> nullName  = Optional.of(null);   // throws null pointer exception
        System.out.println(nullName);
    */

        System.out.println("Optional Name is : " + name.get());

        //the value may contain or maynot contain a value  , if value is null , it will return Empty optional instead of throwing the exception

        Optional<String> name1  = Optional.ofNullable(null);

        System.out.println("Optional of Nullable name  is : " + name1);

        Optional<String> empNames  = Optional.of(" ");

        empNames.ifPresentOrElse(System.out::println, ()-> System.out.println("No Value is present"));
















    }
}
