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
@Table(name = "blogs")
@Where(clause = "isDelele=false")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
//    @Column(name="content",columnDefinition="LONGTEXT")
    private String content;

    @NotNull
    private String image;

    @NotNull
    private Date dateAdd = new Date();

    @NotNull
    private Date dateUpdate;

    @NotNull
    private Date dateDelete;

    private boolean isDelete=false;


}
