public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        Parser parser = new Parser();
        Calculator calculator = new Calculator();

        while (parser.checkQuit(reader.readInput())) {
            try {
                parser.parseExpression(reader.getInput());
                System.out.println(calculator.calculate(parser.getInput()));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        reader.closeSource();
    }
}
