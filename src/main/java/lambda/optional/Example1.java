package lambda.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example1 {

    public static void main(String[] args) {
        String str[] = {"one","two",null,"four","five"};
        List<String> strList=Arrays.asList(str);
        strList.stream().map(a -> Optional.ofNullable(a)).forEach(a -> a.isPresent());

    }
}
