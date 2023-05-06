// Given an unsorted array of unique integers in the range from 1 to n+1.
// Find the missing element without sorting the array,

import java.util.Scanner;
public class qs_11{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int missingElement = findMissingElement(arr);
        System.out.println(missingElement);
    }

    public static int findMissingElement(int[] arr) {
        int n = arr.length + 1; // the size of the original array
        int sum = n * (n + 1) / 2; // sum of all elements from 1 to n
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i]; // subtract each element from the sum
        }
        return sum; // the remaining sum is the missing element
    }
}
