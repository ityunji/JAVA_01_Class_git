import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("숫자 입력 : ");
    int num = scanner.nextInt();  //int를 입력받겠다
    System.out.printf("num : %d", num);
  }
}