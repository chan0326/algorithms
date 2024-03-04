package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class HoneyPicking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arry[] = new int[sc.nextInt()];
        int arry2[] = new int[arry.length];
        int arry3[] = new int[arry.length];
        int arry4[] = new int[arry.length];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        int sum[] =new int[arry.length];
        sum[0] = arry[0];
        for (int i=1; i< arry.length; i++){
            sum[i]=sum[i-1]+arry[i];
        }
        //꿀벌벌
        int max15 = 15;
        int max = 0;
        for (int i=0;i<arry.length-1;i++){
            arry2[i]=sum[arry.length-1]+sum[i]-(arry[i]*2)-arry[arry.length-1];
        }
        int max2 = 0;
        //벌벌꿀
        sum[arry.length-1]=arry[arry.length-1];
        for (int i =arry.length-2;i>=0; i--){
            sum[i] = sum[i+1]+arry[i];
        }
        for (int i =arry.length-2;i>0; i--){
            arry3[i]=sum[0]-arry[0]+sum[i]-(arry[i]*2);
        }
        // 벌 끌 벌
        int max3 = 0;
        for (int i = 1; i < arry.length - 1; i++) {
            max3 += arry[i];
        }
        int maxmax = 0;
        for (int h = 1; h < arry.length - 1; h++) {
            maxmax = max3 + arry[h];
            arry4[h] = maxmax;
        }
        Arrays.sort(arry2);
        Arrays.sort(arry3);
        Arrays.sort(arry4);
        max = arry2[arry2.length - 1];
        max2 = arry3[arry3.length - 1];
        max3 = arry4[arry4.length - 1];
        int answer = 0;
        int[] intarray = new int[]{max, max2, max3};
        Arrays.sort(intarray);
        answer = intarray[intarray.length - 1];
        System.out.println(answer);
    }
}
