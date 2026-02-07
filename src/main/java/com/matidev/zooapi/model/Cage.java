package com.matidev.zooapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String number;

    @Column(nullable = false)
    private String location;

    @Column(name="max_capacity", nullable = false)
    private int maxCapacity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="zoo_keeper_id")
    private ZooKepper zooKepper;

    @OneToMany(mappedBy = "cage", fetch = FetchType.LAZY)
    private List<Animal> animals = new ArrayList<>();
}
