package com.pichincha.deuna.v1.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Store", uniqueConstraints = {@UniqueConstraint(columnNames = {"cod"})})
@Data
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_store")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cod", nullable = false)
    private String cod;

    @Column(name = "direction", nullable = true)
    private String direction;
    
}