package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class HoneyPicking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arry[] = new int[sc.nextInt()];
        int arry2[] = new int[(arry.length) * (arry.length)];
        int arry3[] = new int[(arry.length) * (arry.length)];
        int arry4[] = new int[(arry.length) * (arry.length)];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }

        // 다시 생각해보자


        //꿀벌벌
        int max = 0;
        int count = 0;
        int maxmax3=0;

        for (int b1 = 0; b1 < arry.length-1; b1++) {
            max += arry[b1];
        }
        maxmax3 = max;

        for (int b2 = 1; b2 < arry.length-1; b2++) {
            int maxb1=0;
            for (int b3 = 0; b3 < b2; b3++) {
                 maxb1 +=arry[b3];


            }
            max = maxmax3+maxb1-arry[b2];

            arry2[count] = max;
            count++;


        }


        int max2 = 0;
        int count2 = 0;

        //벌벌꿀
        for (int b1 = 1; b1 < arry.length; b1++) {
            max2 += arry[b1];
        }
        maxmax3 = max2;
        for (int b2 = 1; b2 < arry.length; b2++) {
            int maxb1=0;

            for (int b3 = b2; b3 < arry.length; b3++) {
                maxb1 += arry[b3];


            }
            max2 = maxmax3 +maxb1 - (arry[b2]*2);
            arry3[count2] = max2;
            count2++;

        }


        // 벌 끌 벌
        int count3 = 0;
        int max3 = 0;

        for (int i = 1; i < arry.length - 1; i++) {
            max3 += arry[i];
        }

        int maxmax = 0;
        for (int h = 1; h < arry.length - 1; h++) {


            maxmax = max3 + arry[h];
            arry4[count3] = maxmax;


            count3++;


        }

        Arrays.sort(arry2);
        Arrays.sort(arry3);
        Arrays.sort(arry4);

        max = arry2[arry2.length - 1];
        max2 = arry3[arry3.length - 1];
        max3 = arry4[arry4.length - 1];
        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);




        int answer = 0;
        int[] intarray = new int[]{max, max2, max3};
        Arrays.sort(intarray);
        answer = intarray[intarray.length - 1];


        System.out.println(answer);


    }
}
