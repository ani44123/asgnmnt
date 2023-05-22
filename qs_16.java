// suppose you are working on a text processing application
// ** remove consecutive vowels.

import java.util.*;
import java.lang.*;

import java.util.Scanner;

class qs_16 {
    // function which returns
    // True or False for
    // occurrence of a vowel
    static boolean isVowel(char c) {
        // compare lowercase vowel
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // function to print
    // resultant string
    static void removeConsecutiveVowels(String str) {
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (!isVowel(str.charAt(i - 1)) || !isVowel(str.charAt(i))) {
                result.append(str.charAt(i));
            }
        }

        System.out.println(result.toString());
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeConsecutiveVowels(str);
    }
}


