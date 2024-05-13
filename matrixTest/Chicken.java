package matrixTest;

import java.util.Scanner;

public class Chicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer =a;
        boolean y = true;
        int i =0;
        int c = 0;

        while (y) {
             i =a/b ;
             c =a%b ;
           answer +=i;
           i= i+c;
           if (i<b){
               y = false;
           }else {a = i;}
        }

        System.out.println(answer);
        }
    }
}
