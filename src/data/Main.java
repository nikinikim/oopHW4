package data;

public class Main {
    public static void main(String[] args) {
        boolean success = Data.checkData("Niki", "Niki91", "Niki92");
        if (success) {
            System.out.println("Вход выполнен");

        }else {
            System.out.println("Ошибка авторизации");
        }
    }
}
