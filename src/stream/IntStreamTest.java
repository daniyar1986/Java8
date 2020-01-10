package stream;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class IntStreamTest {
    @Test
    public void intForeach() {
        IntStream.of(1, 2, 3, 4).forEach(System.out::println);
    }

    @Test
    public void range() {
        IntStream.range(0, 10).forEach(System.out::print);
    }

    @Test
    public void rangeClosed() {
        IntStream.rangeClosed(0, 10).forEach(System.out::print);
    }

    @Test
    public void iterate() {
        IntStream.iterate(0, operand -> operand + 2).forEach(System.out::println);
    }

    @Test
    public void generate() {
        IntStream.generate(() -> ThreadLocalRandom.current().nextInt()).limit(5).forEach(System.out::println);
    }

    @Test
    public void map() {
        IntStream.rangeClosed(1, 10)
                .map(operand -> operand * operand)
                .forEach(value -> System.out.print(value + " "));
    }

    @Test
    public void filter() {
        IntStream.rangeClosed(1, 10)
                .boxed()
                .filter(value -> value % 2 == 0)
                .forEach(value -> System.out.print(value + " "));
    }

}
