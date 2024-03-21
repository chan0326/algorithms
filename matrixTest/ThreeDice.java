package matrixTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        int answer = 0;
        int [] arry = new int[3];
        for (int i=0;i< arry.length;i++){
            arry[i]= sc.nextInt();
        }
        Arrays.sort(arry);

        if ( arry[0] == arry[1] && arry[1] == arry[2]){
            answer = arry[0]*1000+10000;
        }
        if (arry[0] == arry[1] && arry[1] != arry[2] ){
            answer = arry[0]*100+1000;
        }

        if (arry[1] == arry[2] && arry[0] !=arry[1]){
            answer = arry[1]*100+1000;
        }
        if (arry[0]==arry[2] && arry[0]!=arry[1]){
            answer = arry[0]*100+1000;
        }

        if (arry[0] != arry[1] && arry[1] !=arry[2] && arry[0]!=arry[2]){
            answer=arry[2]*100;
        }
        System.out.println(answer);

    }
}
