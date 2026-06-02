import java.util.List;

record Person(String name, int age) {}

class p29 {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Ram", 20),
                new Person("Sam", 17),
                new Person("John", 25)
        );

        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}