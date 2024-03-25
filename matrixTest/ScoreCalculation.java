package matrixTest;

import java.util.Scanner;

public class ScoreCalculation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int [] arry = new int[a];
        int [] arry2 = new  int[a];
        int sum = 0;
        for (int i =0; i< arry.length; i++){
            int b=sc.nextInt();
            arry[i]=b;
            arry2[i]=b;
        }

        for (int i =1; i< arry.length; i++){
            if (arry[i-1]==1 && arry[i]==1){
                arry2[i]=arry2[i-1]+1;
            }
        }
        for (int i =0; i< arry2.length; i++){
            sum += arry2[i];
            }
        System.out.println(sum);


    }
}
