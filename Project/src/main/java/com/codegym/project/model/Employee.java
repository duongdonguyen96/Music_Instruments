package com.codegym.project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table
@Where(clause = "isDelete=false")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String fullName;

    @NotNull
    private String address;

    @NotNull
    private String phone;

    @NotNull
    private String email;

    private String avatar;

    @NotNull
    private String gender;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dayOfBirth;

    @NotNull
    private String idCard;

    @NotNull
    private Date dateAdd = new Date();

    @NotNull
    private Date dateUpdate;

    @NotNull
    private Date dateDelete;

    private String role= "employee";


    private boolean isDelete=false;

}
