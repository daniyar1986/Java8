package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Oracle", "", "Google", "Microsoft", "ABC", "", "Java");
        System.out.println("Count empty in List " + strings.stream().filter(s -> s.isEmpty()).count());
        System.out.println("Count String length = 3 : " + strings.stream().filter(filter -> filter.length() == 3).count());
        System.out.println("Show not empty String" + strings.stream().filter(s -> s != "").collect(Collectors.toList()));
    }
}
