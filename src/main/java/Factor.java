import java.util.stream.IntStream;

/**
 * @author Dany Diaz
 */
public class Factor {

    public static Integer sumFactor(Integer num) {

        char[] numbers = factor(num).toString().toCharArray();

        int acc = 0;

        for (char number: numbers) {
            acc += Integer.parseInt(Character.toString(number));
        }

        return acc;
    }

    public static Integer factor(Integer num) {

        if (num < 0) throw new IllegalArgumentException();

        return IntStream.rangeClosed(2, num)
                .reduce(1, (left, right) -> left * right);
    }
}
