package matrixTest;

import java.util.Scanner;

public class Honeypicking {
    public static void main(String[] args) {
        // 꿀 따기
        Scanner sc = new Scanner(System.in);
        int arry[] = new int[sc.nextInt()];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        int a=0;
        int b=0;
        int max = 0;
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int max4 = 0;
        int max5 = 0;
        int count = 0;


        for (int j = 0; j < arry.length; j++) {
            for (int i = 0; i < arry.length; i++) {
                for (int k = 0; k < arry.length; k++) {
                    if (j > i && k > j) {
                        count++;
                        for (int m = i + 1; m <= j; m++) {
                            max += arry[m];
                        }
                        for (int l = j; l < k; l++) {
                            max += arry[l];
                        }


                        int arry3 [] =new int[count];
                        System.out.println(max);



                    } else if (i > k && k > j) {
                        for (int m = j; m < i; m++) {
                            max1 += arry[m];
                        }
                        for (int l = j; l < k; l++) {
                            max1 += arry[l];
                        }
                        max1 -= arry[k];

                    } else if (j > k && k > i) {
                        for (int m = i + 1; m <= j; m++) {
                            max2 += arry[m];
                        }
                        for (int l = k + 1; l <= j; l++) {
                            max2 += arry[l];
                        }
                        max2 -= arry[k];
                    }


                }
            }
        }
        int answer = 0;
        int[] intarray = new int[]{max, max1, max2};
        for (int i = 0; i < intarray.length; i++) {
            if (answer < intarray[i]) {
                answer = intarray[i];

            }
        }
//        System.out.println(max);
//        System.out.println(max1);
//        System.out.println(max2);
//        System.out.println(max3);
//        System.out.println(max4);
//        System.out.println(max5);
//        System.out.println(answer);


    }
}
