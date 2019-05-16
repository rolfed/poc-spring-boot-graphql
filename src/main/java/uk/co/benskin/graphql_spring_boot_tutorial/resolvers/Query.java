package uk.co.benskin.graphql_spring_boot_tutorial.resolvers;

import java.util.ArrayList;
import java.util.List;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import uk.co.benskin.graphql_spring_boot_tutorial.entities.Pet;
import uk.co.benskin.graphql_spring_boot_tutorial.entities.Car;
import uk.co.benskin.graphql_spring_boot_tutorial.enums.Animal;

@Component
public class Query implements GraphQLQueryResolver {

    public List<Car> cars() {
        List<Car> cars = new ArrayList<>();

        Car aCar = new Car();
        aCar.setId(1);
        aCar.setModel("Sprinter 2500");
        aCar.setMake("Mercedes");
        aCar.setYear(2019);
        cars.add(aCar);

        return cars;
    }

    public List<Pet> pets() {
        List<Pet> pets = new ArrayList<>();

        Pet aPet = new Pet();
        aPet.setId(11);
        aPet.setName("Bill");
        aPet.setAge(9);
        aPet.setType(Animal.MAMMOTH);

        Pet bPet = new Pet();
        bPet.setId(12);
        bPet.setName("Billy");
        bPet.setAge(2);
        bPet.setType(Animal.MAMMOTH);

        pets.add(aPet);
        pets.add(bPet);

        return pets;
    }

}