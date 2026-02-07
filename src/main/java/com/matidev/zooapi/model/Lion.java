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
@Table(name = "lion")
@Entity
@EqualsAndHashCode(callSuper = true)
public class Lion extends Animal{

    @Column(nullable = false, name = "mane_size")
    private String maneSize;

    @Override
    public String getDiet() {
        return "";
    }

    @Override
    public String feed() {
        return "";
    }
}
