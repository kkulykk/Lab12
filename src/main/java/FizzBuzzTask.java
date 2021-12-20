import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzTask {
    public static String fizzBuzzCheck(Integer x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return "fizz buzz";
        }
        else if (x % 5 == 0) {
            return "buzz";
        }
        else if (x % 3 == 0) {
            return "fizz";
        }
        return x.toString();
    }

    public static List<String> fizzBuzzIt(List<Integer> array) {
        return array.stream().map(FizzBuzzTask::fizzBuzzCheck).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        System.out.println(fizzBuzzIt(array));
    }
}
