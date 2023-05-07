// development team
import java.util.Scanner;
public class qs3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                continue;
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}

