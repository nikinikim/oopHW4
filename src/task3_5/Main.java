package task3_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.addValue("str1", 2);
        System.out.println(task3.integerHashMap);
        task3.addValue("str1", 3);
        System.out.println(task3.integerHashMap);

        Map<String, List<Integer>> task4 = new HashMap<>();
        List<Integer> integerList = new ArrayList<>(List.of((int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1));
        List<Integer> integerList2 = new ArrayList<>(List.of((int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1));
        List<Integer> integerList3 = new ArrayList<>(List.of((int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1));
        List<Integer> integerList4 = new ArrayList<>(List.of((int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1));
        List<Integer> integerList5 = new ArrayList<>(List.of((int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1, (int)(Math.random() * 1000) + 1));
        task4.put("str1", integerList);
        task4.put("str2", integerList2);
        task4.put("str3", integerList3);
        task4.put("str4", integerList4);
        task4.put("str5", integerList5);
        System.out.println(task4);

        Map<String, Integer> task4Dub = new HashMap<>();
        for (Map.Entry<String, List<Integer>> dub : task4.entrySet()) {
            task4Dub.put(dub.getKey(), calculateSum(dub.getValue()));
        }
        System.out.println(task4Dub);

        System.out.println("task5");

        Map<Integer, String> keyValues = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String value = "Value " + i;
            keyValues.put(i, value);
        }
        System.out.println(keyValues);
    }
    public static int calculateSum(List<Integer>integerList) {
        int sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        return sum;
    }
}
