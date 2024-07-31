import java.util.List;
import java.util.OptionalDouble;

public class StreamAPI {


    public static int sumEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public static int multiplicationOddNumbers(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).reduce(1, (x, y) -> x * y);
    }

    public static int maxValue(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo).orElse(0);
    }

    public static int[] evenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).toArray();
    }

    public static int avarageNumber(List<Integer> numbers) {
        return (int) numbers.stream().mapToInt(Integer::intValue).average().orElse(0 );
    }
}
