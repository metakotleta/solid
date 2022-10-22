package shopHomework;

import java.util.Scanner;

public class GetData {
    public static final Scanner scanner = new Scanner(System.in);

    public static String getData(String output) {
        System.out.println(output);
        return scanner.nextLine();
    }
}