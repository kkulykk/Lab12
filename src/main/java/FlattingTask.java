import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    public static List<String> flattingStrings(List<String> array) {
        return array.stream().flatMap(x -> Arrays.stream(x.split(""))).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> array = Arrays.asList("hello", "world");
        System.out.println(flattingStrings(array));
    }
}
