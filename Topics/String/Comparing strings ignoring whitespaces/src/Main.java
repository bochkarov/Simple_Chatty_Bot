import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine().replace(" ", "");
        String secondWord = scanner.nextLine().replace(" ", "");
        System.out.println(firstWord.equals(secondWord));

    }
}