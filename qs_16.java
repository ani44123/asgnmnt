// suppose you are working on a text processing application
// ** remove consecutive vowels.

import java.util.*;
import java.lang.*;

class qs_16
{
    // function which returns
    // True or False for
    // occurrence of a vowel
    static boolean myfunction(char c)
    {
        // this compares vowel
        // with character 'c'
        return (c != 'a') && (c != 'e') &&
                (c != 'i') && (c != 'o') &&
                (c != 'u');
    }

    // function to print
    // resultant string
    static void removeVowels(String str)
    {
        // print 1st character
        System.out.print(str.charAt(0));

        // loop to check for
        // each character
        for (int i = 1;
             i < str.length(); i++)

            // comparison of
            // consecutive characters
            if ((myfunction(str.charAt(i - 1))) ||
                    (myfunction(str.charAt(i))))
                System.out.print(str.charAt(i));
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        removeVowels(str);
    }
}

