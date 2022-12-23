package passport;

public class CheckingObjects {

    public static String checkString(String checking) {
        if (checking == null || checking.isEmpty() || checking.isBlank()) {
            throw new IllegalArgumentException("Данные должны быть заполнены!");
        }else {
            return checking;
        }
    }
}
