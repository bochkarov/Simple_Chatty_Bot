import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean check1 = a > 0 && b <= 0 && c <= 0;
        boolean ckeck2 = a <= 0 && b > 0 && c <= 0;
        boolean ckeck3 = a <= 0 && b <= 0 && c > 0;

        System.out.println(check1 || ckeck2 || ckeck3);
    }
}