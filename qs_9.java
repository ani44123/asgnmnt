// A library has a collection of books and they have a requirement to check if the title of book is
// palindrome or not..

import java.util.Scanner;

public class qs_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
        int left = 0; // starting index
        int right = str.length() - 1; // ending index
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // if characters don't match, not a palindrome
            }
            left++; // move to next character from left
            right--; // move to next character from right
        }
        return true; // all characters matched, it's a palindrome
    }
}
