import java.util.Scanner;

public class Pr10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Output: " + isPalindrome);
        scanner.close();
    }
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int original = number;
        int reversed = 0; 
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
}
