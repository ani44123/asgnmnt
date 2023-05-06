// XYZ company is facing a situation where..

import java.util.Scanner;
public class qs_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 0;
        int tmp = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       for(int i=0;i<arr.length;i++){
           for(int j = i+1;j<arr.length;j++) {
               if (arr[i] > arr[j]) {
                   tmp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = tmp;
               }

           }
       }
       max = arr[arr.length-1];
       min = arr[0];
        System.out.println(min);
        System.out.println(max);
       }
    }


