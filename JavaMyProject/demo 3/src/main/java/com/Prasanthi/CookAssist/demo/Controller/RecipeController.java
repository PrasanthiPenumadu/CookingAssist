package com.Prasanthi.CookAssist.demo.Controller;


import com.Prasanthi.CookAssist.demo.Model.Recipe;
import com.Prasanthi.CookAssist.demo.Repository.RecipeRepository;
import com.Prasanthi.CookAssist.demo.Service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping
    public List<Recipe> getAll(){
        return recipeService.getAll();
    }

    @PostMapping
    public ResponseEntity insert(@RequestBody Recipe recipe){
        recipeService.insert(recipe);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping
    public  ResponseEntity update(@RequestBody Recipe recipe){
        recipeService.update(recipe);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam String id){
        recipeService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
