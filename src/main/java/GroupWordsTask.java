
import java.util.*;
import java.util.stream.Collectors;

public class GroupWordsTask {

    public static Integer transform (Map.Entry<Character, List<String>> el) {
        List<String> array = el.getValue();
        String key = el.getKey().toString();
        int amount = 0;
        for (String s : array) {
            int len1 = s.length();
            int len2 = s.replace(key, "").length();
            amount += len1 - len2;
        }
        return amount;
    }

    public static Map<Character, Integer> groupIt(List<String> array) {
        List<Map.Entry<Character, List<String>>> map = new ArrayList<>(array.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet());
        return map.stream().collect(Collectors.toMap(Map.Entry::getKey, GroupWordsTask::transform));
    }

    public static void main(String[] args) {
        List<String> array = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(groupIt(array));
    }
}
