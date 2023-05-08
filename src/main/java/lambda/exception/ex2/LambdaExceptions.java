package lambda.exception.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExceptions {
    public static void main(String[] args) {
        String str[] = {"2","3L","4","5"};
        List<String> list = Arrays.asList(str);
//        list.forEach(System.out::println);

        System.out.println("Before exception");

        list.forEach(s -> {
            try {
                System.out.println(Integer.parseInt(s));
            }finally {
                System.out.println("Inside finally");
            }

        });

        System.out.println("After exception");

//        System.out.println(intList);



    }
}
