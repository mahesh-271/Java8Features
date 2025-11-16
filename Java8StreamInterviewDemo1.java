package streams;

import java.util.Arrays;

public class Java8StreamInterviewDemo1 {

    public static void main(String[] args) {

        String name = "Mahesh Killu J";
        String[] values = name.split(" ");
        System.out.println(Arrays.toString(values));
        System.out.println(values.length);

    }
}
