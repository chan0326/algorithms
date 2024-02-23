package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class Honeypicking {
    public static void main(String[] args) {
        // 꿀 따기
        Scanner sc = new Scanner(System.in);
        int arry[] = new int[sc.nextInt()];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }

        int max = 0;
        int max1 = 0;
        int max2 = 0;

        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int arry3 [] =new int[arry.length*arry.length*arry.length]; //case 1
        int arry4 [] =new int[arry.length*arry.length*arry.length]; //case 2
        int arry5 [] =new int[arry.length*arry.length*arry.length]; //csse 3

        // j= arr.length
        // j= 0
        // j가 짝수
        // j= arr.length/2+1
        // j= arr.length/2
        // j가 홀수


        for (int j = 0; j < arry.length; j++) {
            for (int i = 0; i < arry.length; i++) {
                for (int k = 0; k < arry.length; k++) {
                    if (j > i && k > j) {
                        max = 0;
                        for (int m = i + 1; m <= j; m++) {
                            max += arry[m];
                        }
                        for (int l = j; l < k; l++) {
                            max += arry[l];
                        }
                        arry3[count] = max;

                        count++;






                    } else if (i > k && k > j) {
                        max1 = 0;
                        for (int m = j; m < i; m++) {
                            max1 += arry[m];
                        }
                        for (int l = j; l < k; l++) {
                            max1 += arry[l];
                        }
                        max1 -= arry[k];
                        arry4[count1] = max1;
                        count1++;

                    } else if (j > k && k > i) {
                        max2 =0;
                        for (int m = i + 1; m <= j; m++) {
                            max2 += arry[m];
                        }
                        for (int l = k + 1; l <= j; l++) {
                            max2 += arry[l];
                        }
                        max2 -= arry[k];
                        arry5[count2] = max2;
                        count2++;
                    }


                }
            }
        }
        int arry3Max =0;
        int arry4Max =0;
        int arry5Max =0;
        Arrays.sort(arry3);
        arry3Max = arry3[arry3.length-1];
        Arrays.sort(arry4);
        arry4Max = arry4[arry4.length-1];
        Arrays.sort(arry5);
        arry5Max = arry5[arry5.length-1];

//        for (int i = 0;i<arry3.length;i++){
//            if (arry3Max < arry3[i]){
//                arry3Max = arry3[i];
//            }
//        }

        int answer = 0;
        int[] intarray = new int[]{arry3Max, arry4Max, arry5Max};
        Arrays.sort(intarray);
        answer = intarray[intarray.length-1];


        System.out.println(answer);


    }
}
