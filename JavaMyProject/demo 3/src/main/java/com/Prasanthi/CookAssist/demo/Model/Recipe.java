package com.Prasanthi.CookAssist.demo.Model;

import lombok.Data;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Entity
@Data
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "recipeStepNumber")
    private Integer recipeStepNumber;
    @Column(name = "recipeStepProcedure")
    private String recipeStepProcedure;

    private Integer cookTime;
    private String ingredients;
}
