//  demonstrate interface...

import java.util.*;
interface myintrfc {
    int num = 10;
    void display(String str);
}


class cls1 implements myintrfc {
    public void display(String str) {
        System.out.println(str);
        System.out.println(num);
    }
}


public class qs_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        cls1 obj = new cls1();
        obj.display(str);
    }
}