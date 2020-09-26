package guru.springframework.domain;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipe() {
        return recipes;
    }

    public void setRecipe(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    @ManyToMany(mappedBy = "categories")
    private Collection<Recipe> recipes2;

    public Collection<Recipe> getRecipes2() {
        return recipes2;
    }

    public void setRecipes2(Collection<Recipe> recipes2) {
        this.recipes2 = recipes2;
    }
}
