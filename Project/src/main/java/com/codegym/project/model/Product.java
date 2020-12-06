package com.codegym.project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "products")
@Where(clause = "isDelete=false")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String productName;

    @NotNull
    private Long price;

    @NotNull
    private String image;

    @NotNull
    private String description;

    @NotNull
    private Long weight;

    @NotNull
    private Long size;

    private String color;

    @NotNull
    private Date dateAdd = new Date();

    @NotNull
    private Date dateUpdate;

    @NotNull
    private Date dateDelete;

    @NotNull
    private Long amount;

    private boolean isDelete = false;

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

    @ManyToOne
    @JoinColumn(name = "typeProduct_id")
    private TypeProduct typeProduct;
}