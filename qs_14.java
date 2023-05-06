// Lunu a first grade student

import java.util.Scanner;
public class qs_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] arr =str1.split("\\s");
        int c = 0;
        for(int i=0;i<arr.length;i++){
            c  = c+1;
        }
        System.out.println(c);
    }
}
