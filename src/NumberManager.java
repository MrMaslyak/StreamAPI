import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberManager {

    private List<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void printResults() {
        int sumOfEvens = StreamAPI.sumEvenNumbers(numbers);
        System.out.println("Сума парних чисел у списку: " + sumOfEvens);

        int multiEveryNumber = StreamAPI.multiplicationOddNumbers(numbers);
        System.out.println("Добуток усіх чисел у списку: " + multiEveryNumber);

        int maxValue = StreamAPI.maxValue(numbers);
        System.out.println("Максимальне значення у списку: " + maxValue);

        int[] evenNumbers = StreamAPI.evenNumbers(numbers);
        System.out.println("Непарні числа у списку: " + Arrays.toString(evenNumbers));

        int avarageNumber = StreamAPI.avarageNumber(numbers);
        System.out.println("Середнє арифметичне: " + avarageNumber);
    }
}
