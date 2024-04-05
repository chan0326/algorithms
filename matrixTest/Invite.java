package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class Invite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arry = new int[sc.nextInt()];
        for (int i=0; i< arry.length;i++){
            arry[i]= sc.nextInt();
        }
        Arrays.sort(arry);
        System.out.println(arry[arry.length-1]+3);
    }
}
