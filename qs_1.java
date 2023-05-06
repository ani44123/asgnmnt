import java.util.Scanner;

interface Summable {
    int sum(int[] arr);
}

class EvenSum implements Summable {
    @Override
    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
}

class OddSum implements Summable {
    @Override
    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
}

public class qs_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Summable evenSum = new EvenSum();
        Summable oddSum = new OddSum();

        int evenTotal = evenSum.sum(arr);
        int oddTotal = oddSum.sum(arr);

        String maxSumType = "";
        int maxSum = 0;
        if (evenTotal > oddTotal) {
            maxSumType = "even";
            maxSum = evenTotal;
        } else {
            maxSumType = "odd";
            maxSum = oddTotal;
        }

        System.out.println("Sum of elements in even positions: " + evenTotal);
        System.out.println("Sum of elements in odd positions: " + oddTotal);
        System.out.println("Element(s) in " + maxSumType + " position with highest sum: ");

        for (int i = 0; i < arr.length; i++) {
            if ((i % 2 == 0 && maxSumType.equals("even")) || (i % 2 == 1 && maxSumType.equals("odd"))) {
                if (arr[i] == maxSum) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
