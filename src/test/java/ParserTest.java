import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParserTest {
    private Parser parser = new Parser();

    @Test(expected = Exception.class)
    public void shouldFailWhenInputIsShorterThanExpected() {
        parser.parseExpression("5 + ");
    }

    @Test(expected = Exception.class)
    public void shouldFailWhenFirstOperandIsNotNumber() {
        parser.parseExpression("a + 5");
    }

    @Test(expected = Exception.class)
    public void shouldFailWhenSecondOperandIsNotNumber() {
        parser.parseExpression("5 + r");
    }

    @Test(expected = Exception.class)
    public void shouldFailWhenInputDoesNotContainWhitespaces() {
        parser.parseExpression("5+5");
    }

    @Test
    public void shouldReturnTrueWhenOtherStatementThanQuitIsProvided() {
        boolean result = parser.checkQuit("5 + 5");
        assertThat("Parser should return true when statement is provided", result, equalTo(true));
    }

    @Test
    public void shouldReturnFalseWhenCalledWithQuit() {
        boolean result = parser.checkQuit("quit");
        assertThat("Parser should return false when called with quit", result, equalTo(false));
    }
}
