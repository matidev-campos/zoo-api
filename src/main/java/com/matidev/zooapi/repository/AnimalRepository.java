package com.matidev.zooapi.repository;

import com.matidev.zooapi.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByCageId(Long cageId);

    /**
     * Busca animales cuyo nombre contenga el texto dado (case-insensitive).
     */
    List<Animal> findByNameContainingIgnoreCase(String name);

    /**
     * Query personalizado: busca animales por tipo específico usando discriminador.
     */
    @Query("SELECT a FROM Animal a WHERE TYPE(a) = :type")
    List<Animal> findByTipo(@Param("type") Class<? extends Animal> type);
}
