package transport.enums;

public enum TypeOfBody {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    WAGON("Фургон"),
    MINIVAN("Минивэн");

    private String title;

    TypeOfBody(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
