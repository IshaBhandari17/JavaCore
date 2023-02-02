import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalnumber = number;
        while (number != 0) {
            int lastdigit = number % 10;
            reverse = (reverse * 10) + lastdigit;
            number = number / 10;
        }
        return (originalnumber == reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(isPalindrome(a));
    }

}
