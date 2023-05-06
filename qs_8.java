// Given an array A consisting of N number of elements.
// If the sum of the element is "even" print sum....

import java.util.Scanner;
public class qs_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = 0;
        int p = 1;
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int s1 : arr){
            s = s+s1;
        }

        for(int p1 : arr){
            p = p*p1;
        }
        if(s%2==0){
            System.out.println(s);
        }
        else{
            System.out.println(p);
        }
    }
}
