// weighing machine

import java.util.Scanner;
public class qs_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //taking the size of the array from user.
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();  // taking array inputs from the user.
            }
        }

        for(int i : arr){
            sum = sum+i; // strong sum of elements in 'sum' variable
        }
        System.out.println(sum);
    }
}
