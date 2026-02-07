package com.matidev.zooapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "snake")
@Entity
@EqualsAndHashCode(callSuper = true)
public class Snake extends Animal{

    @Column(nullable = false)
    private boolean poisonous;

    @Column(name = "length_meters", nullable = false)
    private double lengthMeters;

    @Override
    public String getDiet() {
        return "Carnivore: rodents";
    }

    @Override
    public String feed() {
        String type = poisonous ? "poisonous" : "no poisonous";
        return "A live rodent is introduced into the terrarium. "
                + "The snake " + getClass().getName() + "coils up and swallows its prey.";
    }
}
