package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class HoneyPicking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arry[] = new int[sc.nextInt()];
        int arry2[] = new int[(arry.length-2)*(arry.length-3)];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        int max=0;

        // 다시 생각해보자


        //꿀벌벌
        for (int b1 =0;b1<arry.length;b1++) {
            max += arry[b1];
        }


        for ( int b2=0;b2< arry.length-1;b2++) {
            max += arry[b2];
        }
        for (int sum =0; sum<=b2;sum++) {
        }
        ;





        int max2=0;
           //벌벌꿀

        for (int i=2;i<arry.length;i++){
            max2 += arry[i];
        }
        max2=max*2;



        // 벌 끌 벌
        int count =0;
        int max3=0;
        for (int h =1;h< arry.length-1;h++) {
            max3=0;

            for (int i = 1; i <arry.length-1; i++) {
                max3 += arry[i];

            }
            max3+= arry[h];
            arry2[count]=max3;

            count++;



        }
        Arrays.sort(arry2);
        max3 = arry2[arry2.length-1];
        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);




        int answer = 0;
        int[] intarray = new int[]{max, max2, max3 };
        Arrays.sort(intarray);
        answer = intarray[intarray.length-1];


        System.out.println(answer);




    }
}
