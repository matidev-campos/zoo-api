package com.matidev.zooapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ZooKepper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String speciality;  // ej: "Felinos", "Reptiles", "Herbívoros"

    @Column(name = "years_experience", nullable = false)
    private int yearsExperience;

    @OneToMany(mappedBy = "cuidador", fetch = FetchType.LAZY)
    private List<Cage> cages = new ArrayList<>();

}
