package phonebook;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Phonebook one = new Phonebook("Андрей Сидоров", "+799999999998");
        Phonebook two = new Phonebook("Алексей Ольхин", "+799999999999");
        Phonebook three = new Phonebook("Александр Фёдоров", "+799999999997");
        Phonebook four = new Phonebook("Максим Максимов", "+799999999996");
        Phonebook five = new Phonebook("Алексей Николаев", "+799999999995");
        Phonebook six = new Phonebook("Алексей Романов", "+799999999994");
        Phonebook seven = new Phonebook("Алексей Артёмов", "+799999999993");
        Phonebook eight = new Phonebook("Алексей Дмитриев", "+799999999992");
        Phonebook nine = new Phonebook("Алексей Александров", "+799999999991");
        Phonebook ten = new Phonebook("Алексей Тупиков", "+799999999990");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(one.getFirstAndLastName(), one.getNumber());
        hashMap.put(two.getFirstAndLastName(), two.getNumber());
        hashMap.put(three.getFirstAndLastName(), three.getNumber());
        hashMap.put(four.getFirstAndLastName(), four.getNumber());
        hashMap.put(five.getFirstAndLastName(), five.getNumber());
        hashMap.put(six.getFirstAndLastName(), six.getNumber());
        hashMap.put(seven.getFirstAndLastName(), seven.getNumber());
        hashMap.put(eight.getFirstAndLastName(), eight.getNumber());
        hashMap.put(nine.getFirstAndLastName(), nine.getNumber());

        System.out.println(hashMap);
    }
}
