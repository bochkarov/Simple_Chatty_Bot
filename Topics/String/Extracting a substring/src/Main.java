import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt() + 1;

        System.out.print(word.substring(firstNumber, secondNumber));
        // put your code here
    }
}