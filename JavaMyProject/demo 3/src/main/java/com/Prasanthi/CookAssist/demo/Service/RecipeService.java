package com.Prasanthi.CookAssist.demo.Service;

import com.Prasanthi.CookAssist.demo.Model.Recipe;
import com.Prasanthi.CookAssist.demo.Repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe>getAll(){
        Iterable<Recipe> recipes=recipeRepository.findAll();
        List<Recipe> recipeList=new ArrayList<>();
        recipes.forEach(recipeList::add);
        return recipeList;
    }

    public void insert(Recipe recipe){
        recipeRepository.save(recipe);
    }

    public void update(Recipe recipe){
        recipeRepository.save(recipe);
    }

    public void delete(@RequestParam String id){
        recipeRepository.deleteById(id);
    }
}
