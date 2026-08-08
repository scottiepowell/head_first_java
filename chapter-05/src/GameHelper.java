import java.util.Scanner;

public class GameHelper {

  public int getUserInput (String prompt) {
    System.out.print(prompt + ": ");
    Scanner scanner = new Scanner(system.in);
    return scanner.nextInt();

  }
}
