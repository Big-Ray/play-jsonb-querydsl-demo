package service.dog;

import models.Dog;

import java.util.Arrays;
import java.util.List;

public class DogApplicationService {

    public static List<Dog> getDogs() {
        return Arrays.asList(
                new Dog(1L, "Fahra", 8, true),
                new Dog(2L, "Rocky", 2, false),
                new Dog(3L, "Zouma", 4, true)
        );
    }

    public static Dog getDog() {
        return new Dog(1L, "Fahra", 8, true);
    }

    public static Dog getOtherDog() {
        Dog dog = new Dog();

        return dog;
    }
}
