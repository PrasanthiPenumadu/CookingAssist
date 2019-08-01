package com.Prasanthi.CookAssist.demo.Model;

import lombok.Data;

import javax.lang.model.element.Name;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data

public class Recipe {
    @Id
    @GeneratedValue(generator = "system-uuid")

    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "recipeStepNumber")
    private Integer recipeStepNumber;
    @Column(name = "recipeStepProcedure")
    private String recipeStepProcedure;

    private Integer cookTime;
    private String ingredients;
}
