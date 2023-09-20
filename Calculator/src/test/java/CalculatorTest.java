import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }
    @Test
    @DisplayName("#add > When Both Numers Are Positive > Return A Positive Number")
    void addWhenBothNumersArePositiveReturnAPositiveNumber()
    {
        int result = calculator.add(3,4);
        Assertions.assertEquals(7, result);
    }
    @Test
    void addWhenBothNumbersAreNegativeReturnANegativeNumber(){
        int result = calculator.add(-2,-7);
        Assertions.assertEquals(-7, result);
    }
    @Test
    void addWhenOneNumberIsPositiveAndTheAnotherIsNegativeReturnAPositiveNumber(){
        int result = calculator.add(-3, 4);
        Assertions.assertEquals(1, result);
    }
    @Test
    void addWhenOneNumberIsPositiveAndTheAnotherIsNegativeReturnANegativeNumber(){
        int result = calculator.add(3, -4);
        Assertions.assertEquals(-1, result);
    }
    @Test
    void addWhenNumberIsZeroReturnTheGiverNumber(){
        int result = calculator.add(3, 0);
        Assertions.assertEquals(3, result);
        int secondResult = calculator.add(0, 3);
        Assertions.assertEquals(3, secondResult);
        Assertions.assertAll(
                () -> Assertions.assertEquals(3, result),
                () -> Assertions.assertEquals(3, secondResult)
        );
    }
    @Test
    void addWhenBotNumbersAreZeroReturnZero(){
        int result = calculator.add(0, 0);
        Assertions.assertEquals(0, 0);
    }
    @Test
    void addWhenOneNumberIsNegativeAndTheAnotherIsZeroReturnTheGiverNumber(){
        int result = calculator.add(-3, 0);
        Assertions.assertEquals(-3, result);
        int secondResult = calculator.add(0, -3);
        Assertions.assertEquals(-3, secondResult);
        Assertions.assertAll(
                () -> Assertions.assertEquals(-3, result),
                () -> Assertions.assertEquals(-3, secondResult)
        );
    }
    @Test
    @DisplayName("#divide > When the divider is zero > Throw an exception ")
        void divideWhenTheDividerIsZeroThrowAnException(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5,0);
        });
        }
}
