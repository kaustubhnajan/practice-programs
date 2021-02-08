import java.util.*;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {
        String str = "the quick brown fox jumps fox fox over the lazy dog brown";
        List<String> words = Arrays.asList(str.split(" "));

        Map<String, Integer> map =
                words.parallelStream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));

        Map<Integer, Set<String>> finalMap = new TreeMap<>(Comparator.reverseOrder());
        map.entrySet().stream()
                .forEach(e -> {
                    if (finalMap.containsKey(e.getValue())) {
                        finalMap.get(e.getValue()).add(e.getKey());
                    } else {
                        Set<String> set = new TreeSet<>();
                        set.add(e.getKey());
                        finalMap.put(e.getValue(), set);
                    }
                });

        for (Map.Entry<Integer, Set<String>> entry : finalMap.entrySet()) {
            entry.getValue().stream()
                    .forEach(value -> System.out.println(entry.getKey() + " " + value));
        }
    }
}
