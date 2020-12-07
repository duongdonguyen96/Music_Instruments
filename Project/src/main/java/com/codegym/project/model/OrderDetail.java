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
@Table(name = "orderDetails")
@Where(clause = "isDelete=false")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long quantity;

    private String status="pending";

    @NotNull
    private Date dateAdd = new Date();

    private Date dateUpdate;

    private Date dateDelete;

    @NotNull
    private Long price;

    private boolean isDelete = false;
}
