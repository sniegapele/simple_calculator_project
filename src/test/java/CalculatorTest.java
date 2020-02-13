import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void shouldReturnSumWhenCalledWithTwoNumbers() {
        Double result = calculator.calculate(new String[]{"0", "+", "6"});
        assertThat("Calculator should return sum value when called with two numbers", result, equalTo(6.0));
    }

    @Test
    public void shouldReturnSubtractionWhenCalledWithTwoNumbers() {
        Double result = calculator.calculate(new String[]{"1000", "-", "5.9"});
        assertThat("Calculator should return subtraction value when called with two numbers", result, equalTo(994.1));
    }

    @Test
    public void shouldReturnMultiplicationWhenCalledWithTwoNumbers() {
        Double result = calculator.calculate(new String[]{"100", "*", "2.1"});
        assertThat("Calculator should return multiplication value when called with two numbers", result, equalTo(210.0));
    }

    @Test
    public void shouldReturnDivisionWhenCalledWithTwoNumbers() {
        Double result = calculator.calculate(new String[]{"500", "/", "5"});
        assertThat("Calculator should return division value when called with two numbers", result, equalTo(100.0));
    }

    @Test(expected = Exception.class)
    public void shouldFailCalculationWhenCalledWithNotNumbers() {
        Double result = calculator.calculate(new String[]{"a", "+", "b"});
    }

    @Test(expected = Exception.class)
    public void shouldFailWhenOperationIsNotFound() {
        Double result = calculator.calculate(new String[]{"2", "x", "5"});
    }
}
