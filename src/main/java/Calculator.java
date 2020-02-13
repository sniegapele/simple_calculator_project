public class Calculator {
    public double calculate(String[] input) {
        Double number1 = Double.parseDouble(input[0]);
        Double number2 = Double.parseDouble(input[2]);
        switch (input[1]) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
            default:
                throw new ArithmeticException("operation not found");
        }
    }
}
