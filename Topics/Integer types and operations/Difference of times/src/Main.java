import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstHours = scanner.nextInt();
        int firsMinutes = scanner.nextInt();
        int firstSeconds = scanner.nextInt();

        int secoundHours = scanner.nextInt();
        int secondMinutes = scanner.nextInt();
        int secondSeconds = scanner.nextInt();

        System.out.println(secoundHours * 3600 + secondMinutes * 60 + secondSeconds
                - (firstHours * 3600 + firsMinutes * 60 + firstSeconds));
    }
}