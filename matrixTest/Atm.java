package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arry = new int[sc.nextInt()];
        int answer = 0;
        for (int i=0; i<arry.length;i++){
            arry[i]=sc.nextInt();
        }
        Arrays.sort(arry);
        for (int i=0; i<arry.length;i++){
            for (int j=0; j<i+1; j++){
                answer= arry[j]+answer;
            }
        }
        System.out.println(answer);

    }
}
