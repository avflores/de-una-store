package com.pichincha.deuna.v1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Product_Store", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_product", "id_store"})})
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductStore implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product_store")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "id_store", nullable = false)
    private Store store;

}
