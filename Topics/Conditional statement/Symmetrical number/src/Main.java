import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int firstNumber = num / 1000;
        int secondNumber = (num % 1000) / 100;
        int thirdNumber = ((num % 1000) % 100) / 10;
        int fourthNumber = ((num % 1000) % 100) % 10;

        if (firstNumber == fourthNumber && secondNumber == thirdNumber) {
            System.out.println(1);
        } else {
            System.out.println(32);
        }
    }
}
