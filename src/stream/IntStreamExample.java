package stream;

import org.junit.Test;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamExample {
    public static void main(String[] args) {
        OptionalDouble average = IntStream.of(100, 200, 300, 400).average();
        OptionalInt max = IntStream.of(100, 200, 300, 400).max();
        OptionalInt min = IntStream.of(100, 200, 300, 400).min();
        int sum = IntStream.of(100, 200, 300, 400).sum();
        IntSummaryStatistics intSummaryStatistics = IntStream.of(100, 200, 300, 400).summaryStatistics();

        System.out.println("IntStream average() = " + average.getAsDouble());
        System.out.println("InStream max() " + max.getAsInt());
        System.out.println("InStream min()" + min.getAsInt());
        System.out.println("IntStream sum() " + sum);
        System.out.println("IntStream  summaryStatistics" + intSummaryStatistics);

        IntStream.builder()
                .add(23)
                .add(45)
                .build();
        LongStream longStream = IntStream.of(100, 200, 300, 400).distinct().mapToLong(value -> value);
        System.out.println(longStream.findAny().getAsLong());

    }


}
