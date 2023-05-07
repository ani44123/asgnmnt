// create an interface that has the following method...

import java.util.*;
public class qs_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int add = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = m-1; j >= i; j--)
            {
                add = add + a[i][j];
            }
        }
        System.out.println(add);
}

}
