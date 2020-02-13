import java.util.Scanner;

public class Reader {
    private Scanner sc;
    private String input;

    public Reader() {
        sc = new Scanner(System.in);
    }

    public void closeSource() {
        sc.close();
    }

    public String readInput() {
        input = sc.nextLine();
        return input;
    }

    public String getInput() {
        return input;
    }
}
