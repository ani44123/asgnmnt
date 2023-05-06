// vijay is working in a software company...

import java.util.Scanner;

public class qs_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(myfunction(str1));

    }
    public static String myfunction(String str){
        String words[]=str.split("\\s");
        String myfunction="";
        for(String w:words){
            String f1=w.substring(0,1);
            String a1=w.substring(1);
            myfunction+=f1.toUpperCase()+a1+" ";
        }
        return myfunction.trim();
    }
}

