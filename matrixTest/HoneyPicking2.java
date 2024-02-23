package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class HoneyPicking2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arry[] = new int[sc.nextInt()];
        for (int i = 0; i < arry.length; i++) {
            arry[i] = sc.nextInt();
        }
        int max=0;
        int honey =0;

        for ( int i=0;i< arry.length;i++) {
            max += arry[i];

        }
            for (int k=0;k< arry.length-1;k++){
                max +=arry[k];

        }
            max -=(arry[arry.length-1]+arry[arry.length-2]+arry[arry.length-2]);

        int max2=0;
          honey =arry.length;

        for (int i=0;i<arry.length;i++){
            max2 += arry[i];
        }
        for (int k=1;k< arry.length;k++){
            max2+=arry[k];
        }
        max2-=(arry[0]+arry[1]+arry[1]);

        int max3=0;
        int max4=0;
        int max5=0;
         if (arry.length %2==0){
             honey = arry.length/2-1;
             for (int i =1;i<=honey;i++){
                 max3+=arry[i];
             }
             for (int k= honey;k<arry.length-1;k++){
                 max3+=arry[k];
             }
             honey = arry.length/2;
             for (int i =1;i<=honey;i++){
                 max4+=arry[i];
             }
             for (int k= honey;k<arry.length-1;k++){
                 max4+=arry[k];
             }

         }
         else {
             honey = arry.length/2;
         }for (int i =1;i<=honey;i++){
            max5+=arry[i];
        }
        for (int k= honey;k<arry.length-1;k++){
            max5+=arry[k];
        }

        int answer = 0;
        int[] intarray = new int[]{max, max2, max3 , max4 ,max5};
        Arrays.sort(intarray);
        answer = intarray[intarray.length-1];


        System.out.println(answer);




    }
}
