import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 7);
        hashMap.put("b", 13);
        hashMap.put("c", 5);
        hashMap.put("d", 9);
        System.out.println(hashMap+ "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("a", 7);
        linkedHashMap.put("b", 13);
        linkedHashMap.put("c", 5);
        linkedHashMap.put("d", 9);
        System.out.println(linkedHashMap.get("b"));
    }
}
