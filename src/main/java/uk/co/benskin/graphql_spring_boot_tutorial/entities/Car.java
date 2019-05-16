package uk.co.benskin.graphql_spring_boot_tutorial.entities;

import lombok.Data;

@Data
public class Car {
    private long id;
    private String model;
    private String make;
    private long year;
}
