package passport;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("123687412", "Васильев", "Артем", null, "22.11.1992"));
        passports.add(new Passport("123687413", "Олегин", "Михаил", null, "22.12.1992"));
        passports.add(new Passport("123687434", "Александров", "Алексей", null, "22.01.1992"));
        passports.add(new Passport("123687489", "Совков", "Артем", null, "22.07.1992"));

        PassportList list = new PassportList(passports);

        System.out.println(list);

        list.add(new Passport("123687414", "Дмитриев", "Василий", "Алексеевич", "22.12.1992"));

        System.out.println(list);




    }
}
