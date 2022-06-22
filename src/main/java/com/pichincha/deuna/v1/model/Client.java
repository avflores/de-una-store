package com.pichincha.deuna.v1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Client", uniqueConstraints = {@UniqueConstraint(columnNames = {"document", "name"})})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_client")
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<OrderHeader> orderHeaders;

    @Column(name = "document", nullable = false)
    private String document;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "picture")
    private String picture;
}