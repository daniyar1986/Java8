package stream;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println("Count empty in List"+strings.stream().filter(s -> s.isEmpty()).count());
    }
}
