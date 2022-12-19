package products;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<Product> foodBasket = new HashSet<>();

        Product orange = new Product("Апельсин", 43.00, 0.200);
        Product egg = new Product("Яйцо", 93.00, 0.300);
        Product tomato = new Product("Помидор", 115.50, 1.200);
        Product chicken = new Product("Курица", 230.00, 2.300);
        Product bread = new Product("Хлеб", 23.00, 0.400);
        Product apple = new Product("Яблоко", 143.00, 2.200);
        Product cucumber = new Product("Огурец", 13.00, 0.100);

        orange.addProduct(foodBasket);
        egg.addProduct(foodBasket);
        tomato.addProduct(foodBasket);
        chicken.addProduct(foodBasket);
        bread.addProduct(foodBasket);
        apple.addProduct(foodBasket);
        cucumber.addProduct(foodBasket);

        System.out.println(foodBasket);
        System.out.println();

        Set<Recipe> recipes = new HashSet<>();
        Recipe sandwitch = new Recipe("Бутерброд");
        Recipe chickenTomato = new Recipe("Курица с помидором");
        Recipe friedEgg = new Recipe("Жаренная яишница");
        Recipe fruitSalad = new Recipe("Фруктовый салат");

        sandwitch.addProductsInTheRecipe(bread, tomato, chicken);
        chickenTomato.addProductsInTheRecipe(chicken, tomato);
        friedEgg.addProductsInTheRecipe(egg, tomato);
        fruitSalad.addProductsInTheRecipe(orange, apple);

        sandwitch.addRecipe(recipes);
        chickenTomato.addRecipe(recipes);
        friedEgg.addRecipe(recipes);
        fruitSalad.addRecipe(recipes);

        System.out.println(recipes);
        System.out.println();

        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i <= 20; i++) {
            integerSet.add((int) (Math.random() * 1000));
        }
        integerSet.removeIf(integer -> integer % 2 != 0);
        System.out.println(integerSet);
        System.out.println();


    }


}
