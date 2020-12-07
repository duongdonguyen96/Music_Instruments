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
@Table(name = "users")
@Where(clause = "delete=false")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
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

    private String statusAccount="enable";
    @Where(clause = "delete=false")
    private boolean delete = false;


}
