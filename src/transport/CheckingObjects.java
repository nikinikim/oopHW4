package transport;

public class CheckingObjects {

    public static String checkString(String checking) {
        if (checking == null || checking.isEmpty() || checking.isBlank()) {
            return "default";
        }else {
            return checking;
        }
    }
}
