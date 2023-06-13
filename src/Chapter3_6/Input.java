package Chapter3_6;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scanner.next();
        System.out.println("word is " + word);
        String line = scanner.nextLine();
        System.out.println("line is " + line);
    }
}
