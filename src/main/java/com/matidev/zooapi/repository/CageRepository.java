package com.matidev.zooapi.repository;

import com.matidev.zooapi.model.Cage;
import com.matidev.zooapi.model.ZooKepper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CageRepository extends JpaRepository<Cage, Long> {

    List<ZooKepper> findByNumber(String number);

}
