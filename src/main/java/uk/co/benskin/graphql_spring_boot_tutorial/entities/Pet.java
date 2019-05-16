package uk.co.benskin.graphql_spring_boot_tutorial.entities;

import lombok.Data;
import uk.co.benskin.graphql_spring_boot_tutorial.enums.Animal;

import javax.persistence.*;

@Data
@Entity
@Table(name="pets")
public class Pet {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Animal type;


    private int age;
}