// Jim is a little scientist. He has planned to design sfotware to track all his works....

import java.util.Scanner;
public class qs_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = moveUpperCaseToEnd(str);
        System.out.println(result);
    }

    public static String moveUpperCaseToEnd(String str) {
        StringBuilder lowercase = new StringBuilder(); // to store lowercase letters
        StringBuilder uppercase = new StringBuilder(); // to store uppercase letters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercase.append(ch); // append uppercase letters to the end
            } else {
                lowercase.append(ch); // append lowercase letters to the beginning
            }
        }
        return lowercase.toString() + uppercase.toString(); // concatenate the two strings
    }
}
