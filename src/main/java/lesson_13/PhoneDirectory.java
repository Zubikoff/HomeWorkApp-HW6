package lesson_13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneDirectory {
    private HashMap<String, HashSet<String>> names = new HashMap<>();

    public void add(String lastName, String phone) {
        if (names.get(lastName) == null) {
            names.put(lastName, new HashSet<>());
        }
        names.get(lastName).add(phone);
    }

    public String get(String lastName) {
        return names.get(lastName) != null ? names.get(lastName).toString() : "no number found";
    }

    public void printAll() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, HashSet<String>> entry: names.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" : ");
            sb.append(entry.getValue());
            sb.append("; ");
        }
        System.out.println(sb);
    }
}
