package com.matidev.zooapi.repository;

import com.matidev.zooapi.model.ZooKepper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ZookeeperRepository extends JpaRepository<ZooKepper, Long> {

    List<ZooKepper> findBySpeciality(String speciality);

}
