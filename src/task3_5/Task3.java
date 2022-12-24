package task3_5;

import com.sun.jdi.request.DuplicateRequestException;

import java.util.HashMap;
import java.util.Objects;

public class Task3 {
    HashMap<String, Integer> integerHashMap = new HashMap<>();

    public void addValue(String key, Integer value) {
        if (Objects.equals(this.integerHashMap.get(key), value)) {
            throw new DuplicateRequestException("Данные уже имеются в карте");
        }
        this.integerHashMap.put(key, value);
    }
}
