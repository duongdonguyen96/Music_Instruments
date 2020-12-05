package com.codegym.project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "vendors")
@Where(clause = "isDelete=false")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String address;

    @NotNull
    private String phone;

    @NotNull
    private String email;

    @NotNull
    private String image;

    @NotNull
    private String surrogate;

    @NotNull
    private Date dateAdd = new Date();

    @NotNull
    private Date dateUpdate;

    @NotNull
    private Date dateDelete;

    private boolean isDelete=false;

    @OneToMany(mappedBy = "vendor")
    private Set<Product> products;
}