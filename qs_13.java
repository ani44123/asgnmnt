// kavya is designing...

import java.util.Scanner;

public class qs_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String vowel = "aeiou";
        int c = 0;
        for(int i=0;i<str1.length();i++){
            if(vowel.indexOf(str1.charAt(i))!= -1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}
