import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static final String SPLIT = " ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (!((input = scanner.nextLine()).equals("end"))) {
            Stream.of(scanner.nextLine().split(SPLIT))
                    .map(elem -> new String(elem))
                    .sorted()
                    .forEach(System.out::println);
        }
    }
}