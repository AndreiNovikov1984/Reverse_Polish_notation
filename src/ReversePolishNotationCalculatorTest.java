
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        Assertions.assertEquals(3, calculate("1 2 +"));
    }

    @Test
    public void shouldCalculateAdditionTwoSpaceThreeSpace() {
        Assertions.assertEquals(3, calculate("1  2   +"));
    }

    @Test
    public void shouldCalculateAdditionOneNegativeResultPositive() {
        Assertions.assertEquals(3, calculate("5 -2 +"));
    }

    @Test
    public void shouldCalculateAdditionOneNegativeResultNegative() {
        Assertions.assertEquals(-1, calculate("1 -2 +"));
    }

    @Test
    public void shouldCalculateAdditionTwoNegativeResultNegative() {
        Assertions.assertEquals(-4, calculate("-2 -2 +"));
    }

    @Test
    public void shouldCalculateSubtractionResultPositive() {
        Assertions.assertEquals(1, calculate("5 4 -"));
    }

    @Test
    public void shouldCalculateSubtractionThreeSpaceTwoSpace() {
        Assertions.assertEquals(3, calculate("5   2  -"));
    }

    @Test
    public void shouldCalculateSubtractionOneNegativeResultPositive() {
        Assertions.assertEquals(9, calculate("5 -4 -"));
    }

    @Test
    public void shouldCalculateSubtractionOneNegativeResultNegative() {
        Assertions.assertEquals(-7, calculate("-3 4 -"));
    }

    @Test
    public void shouldCalculateSubtractionTwoNegativeResultPositive() {
        Assertions.assertEquals(3, calculate("-5 -8 -"));
    }

    @Test
    public void shouldCalculateSubtractionTwoNegativeResultNegative() {
        Assertions.assertEquals(-4, calculate("-8 -4 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        Assertions.assertEquals(20, calculate("4 5 *"));
    }

    @Test
    public void shouldCalculateMultiplicationThreeSpaceTwoSpace() {
        Assertions.assertEquals(10, calculate("5   2  *"));
    }

    @Test
    public void shouldCalculateMultiplicationOneNegative() {
        Assertions.assertEquals(-20, calculate("4 -5 *"));
    }

    @Test
    public void shouldCalculateMultiplicationTwoNegative() {
        Assertions.assertEquals(10, calculate("-2 -5 *"));
    }

    @Test
    public void shouldCalculateMultiplicationNull() {
        Assertions.assertEquals(0, calculate("0 5 *"));
    }

    public int calculate(String line) {
        return calculator.calculatePolishNotation(line);
    }
}
