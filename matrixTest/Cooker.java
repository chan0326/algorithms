package matrixTest;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Cooker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arry0 =new int[4];
        int [] arry1 =new int[4];
        int [] arry2 =new int[4];
        int [] arry3 =new int[4];
        int count =0;
        int count1 =0;
        int count2 =0;
        int count3 =0;
        for (int i =0; i<4; i++){
            arry0[i] = sc.nextInt();
            count += arry0[i];
        }
        for (int i =0; i<4; i++){
            arry1[i] = sc.nextInt();
            count1 += arry0[i];
        }
        for (int i =0; i<4; i++){
            arry2[i] = sc.nextInt();
            count2 += arry0[i];
        }
        for (int i =0; i<4; i++){
            arry3[i] = sc.nextInt();
            count3 += arry0[i];
        }

        int [] sum = {count,count1,count2,count3};
    }
}
