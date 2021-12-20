import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> array) {
        return array.stream().filter(x -> x.matches("\\d+")).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> array = Arrays.asList("1", "abc", "2", "3");
        System.out.println(mapping(array));
    }
}
