package products;

import com.sun.jdi.request.DuplicateRequestException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private Set<Product> productSet;
    private double costOfProducts;
    private String recipeName;

    public Recipe(String recipeName) {
        this.productSet = new HashSet<>();
        this.recipeName = recipeName;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public double getCostOfProducts() {
        return costOfProducts;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void addProductsInTheRecipe(Product... products) {
        this.productSet.addAll(Arrays.asList(products));
        for (Product product : this.productSet) {
            this.costOfProducts += product.getCost();
        }
    }

    public void addRecipe(Set<Recipe> recipes) {
        if (!recipes.contains(this)) {
            recipes.add(this);
        } else {
            throw new DuplicateRequestException("Рецепт "  + this.recipeName + " уже имеется");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.costOfProducts, costOfProducts) == 0 && Objects.equals(productSet, recipe.productSet) && Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productSet, costOfProducts, recipeName);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "productSet=" + productSet +
                ", costOfProducts=" + costOfProducts +
                ", recipeName='" + recipeName + '\'' +
                '}';
    }
}
