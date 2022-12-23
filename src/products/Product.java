package products;

import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private double cost;
    private double weight;

    private boolean bought;


    public Product(String name, double cost, double weight) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара");
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            throw new IllegalArgumentException("Заполните карточку товара");
        }
        if (weight > 0) {
            this.weight = weight;
        }else {
            throw new IllegalArgumentException("Заполните карточку товара");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public void addProduct(Set<Product> foodBasket) {
        if (!foodBasket.contains(this)) {
            foodBasket.add(this);
            this.bought = true;
        }else {
            throw new UnsupportedOperationException("Продукт " + this.name +  " уже имеется в корзине");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 && Double.compare(product.weight, weight) == 0 && bought == product.bought && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, weight, bought);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                ", bought=" + bought +
                '}';
    }
}
