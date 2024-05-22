package matrixTest;

import java.util.Scanner;

public class ChargeLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;
        if (k*n>m){
            answer = k*n-m;
        }else {answer =0;}

        System.out.println(answer);


    }
}
