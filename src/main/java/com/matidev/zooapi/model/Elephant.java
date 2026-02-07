package com.matidev.zooapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "elephant")
@Entity
@EqualsAndHashCode(callSuper = true)
public class Elephant extends Animal {

    private double trunkLength;

    @Override
    public String getDiet() {
        return "Herbivore: fruits, vegetables, and tree leaves";
    }

    @Override
    public String feed() {
        return "A mixture of fruits and leaves is offered to the elephant."
        + "The elephant" + getClass().getName() + "gently raises its trunk to eat.";
    }
}
