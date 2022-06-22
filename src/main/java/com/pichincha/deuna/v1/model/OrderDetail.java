package com.pichincha.deuna.v1.model;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "Order_Detail")
@Data
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_order_detail")
    private Long id;

    @ManyToOne
    @JoinColumn(name= "id_order_header")
    private OrderHeader orderHeader;

    @ManyToOne
    @JoinColumn(name= "id_product_store")
    private ProductStore productStore;

    @Column(name="amount")
    private Integer amount;

    @Column(name="price")
    private BigDecimal price;

}