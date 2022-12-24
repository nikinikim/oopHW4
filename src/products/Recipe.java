package products;

import com.sun.jdi.request.DuplicateRequestException;

import java.util.*;

public class Recipe {
    private HashMap<Product, Integer> productsMap;
    private double costOfProducts;
    private String recipeName;

    public Recipe(String recipeName) {
        this.productsMap = new HashMap<>();
        this.recipeName = recipeName;
    }

    public HashMap<Product,Integer> getProductsMap() {
        return productsMap;
    }

    public double getCostOfProducts() {
        return costOfProducts;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void addProductsInTheRecipe(Product products, int value) {
        value = value == 0 ? 1 : value;
        this.productsMap.put(products, value);
        for (Product product : this.productsMap.keySet()) {
            this.costOfProducts += product.getCost() * this.productsMap.get(product);
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
        return Double.compare(recipe.costOfProducts, costOfProducts) == 0 && Objects.equals(productsMap, recipe.productsMap) && Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsMap, costOfProducts, recipeName);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "productsMap=" + productsMap +
                ", costOfProducts=" + costOfProducts +
                ", recipeName='" + recipeName + '\'' +
                '}';
    }
}
