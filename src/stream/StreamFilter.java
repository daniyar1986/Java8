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

        Person danik = new Person("Danik", 33);
        Person moldir = new Person("Moldir", 29);
        Person akmaral = new Person("Akmaral", 35);

        List<Person> persons = Arrays.asList(danik, moldir, akmaral);
        Person result1 = persons.stream()
                .filter(person -> "Danik".equalsIgnoreCase(person.getName()))
                .findAny()
                .orElse(null);
        System.out.println(result1);

        Person result2 = persons.stream()
                .filter((p) -> "Danik1".equalsIgnoreCase(p.getName()) && p.getAge() == 33)
                .findAny()
                .orElse(null);
        System.out.println(result2);

        persons.stream().map(Person::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        int sum = persons.stream()
                .filter(person -> person.getName().length() > 0)
                .mapToInt(value -> value.getAge())
                .sum();
        System.out.println(sum);

    }


}
