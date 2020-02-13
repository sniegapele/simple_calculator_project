public class Parser {
    private String[] input;

    public void parseExpression(String input) {
        try {
            input = input.trim();
            this.input = input.split(" ");
            if (this.input.length != 3) {
                throw new ArithmeticException("invalid input");
            } else {
                Double.parseDouble(this.input[0]);
                Double.parseDouble(this.input[2]);
            }
        } catch (Exception e) {
            throw new ArithmeticException("invalid input");
        }
    }

    public boolean checkQuit(String input) {
        input = input.trim();
        if (input.equalsIgnoreCase("quit")) {
            return false;
        }
        return true;
    }

    public String[] getInput() {
        return input;
    }
}
