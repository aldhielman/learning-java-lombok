package local.learning.javalombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

    @Test
    void createViaConstructor() {

        var hobbies = new ArrayList<String>();
        hobbies.add("Game");
        hobbies.add("Read");
        hobbies.add("Traveling");

        var person = new Person("100","Thoriq",28,hobbies);

    }

    @Test
    void createViaSetter() {

        var hobbies = new ArrayList<String>();
        hobbies.add("Game");
        hobbies.add("Read");
        hobbies.add("Traveling");

        var person = new Person();

        person.setId("100");
        person.setName("Rivaldi");
        person.setAge(25);
        person.setHobbies(hobbies);

    }

    @Test
    void createViaBuilder() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Game");
        hobbies.add("Read");
        hobbies.add("Traveling");

        var person = Person.builder()
                .id("100")
                .name("Novendra")
                .age(22)
                .hobby("Eat")
                .hobby("Sing")
                .hobbies(hobbies)
                .build();

        System.out.println(person);
    }
}
