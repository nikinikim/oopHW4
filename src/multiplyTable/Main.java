package multiplyTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Task> taskList = new ArrayList<>();
        for (int first = 2; first <= 9; first++){
            for (int second = first; second <= 9; second++) {
                taskList.add(new Task(first, second));
            }
        }
        Collections.shuffle(taskList);
        List<Task> numbers = taskList.subList(0, 15);
        System.out.println(numbers);
    }
}
