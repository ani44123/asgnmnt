import java.util.Scanner;

// kavya is designing...
public class qs_13_method_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        int c = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e'
                    || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
                    || str1.charAt(i) == 'u') {
                c = c+1;
            }


    }
        System.out.println(c);
    }
    }

