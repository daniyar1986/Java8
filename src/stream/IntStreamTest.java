package stream;

import org.junit.Test;

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
    public void itearte() {
        IntStream.iterate(0, operand -> operand + 2).forEach(System.out::println);
    }

}
