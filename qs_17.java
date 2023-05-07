// write a java program that takes an array of integers as input and replaces every negative
// number in the array with the average of all positive numbers.

import java.util.ArrayList;
import java.util.Scanner;

public class qs17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        String input = scanner.nextLine();
        String[] elements = input.split(", ");
        for (String element : elements) {
            list.add(Integer.parseInt(element));
        }

        int size = list.size();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = list.get(i);
        }

        double positiveSum = 0;
        int positiveCount = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > 0) {
                positiveSum += array[i];
                positiveCount++;
            }
        }

        double positiveAverage = 0;
        if (positiveCount > 0) {
            positiveAverage = positiveSum / positiveCount;
        }

        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                if (positiveCount > 0) {
                    array[i] = (int) positiveAverage;
                } else {
                    array[i] = 0;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
