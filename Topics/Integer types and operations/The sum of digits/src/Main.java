import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int units = (number % 100) % 10;
        System.out.println(hundreds + tens + units);
    }
}