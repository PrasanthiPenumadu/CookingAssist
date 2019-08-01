package com.Prasanthi.CookAssist.demo.Repository;

import com.Prasanthi.CookAssist.demo.Model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe,String > {
    Optional<Recipe> findById(String id);
    List<Recipe> findAll();
    Recipe save(Recipe recipe);
    void delete(Recipe recipe);
    void deleteById(String id);
}
