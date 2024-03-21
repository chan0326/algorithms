package matrixTest;

import java.util.Scanner;

public class LightBulbSwitch {
    private static int countA =0;
    private static int countB =0;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int [] inputarry = new int[N];
        int [] answerarry = new int[N];
        int [] answerarrya = new int[N];
        int [] answerarryb = new int[N];
        for (int i=0;i<N;i++){
            inputarry[i]=sc.nextInt();
        }
        for (int i=0;i<N;i++){
            answerarry[i]=sc.nextInt();
        }

        // 원본,정답입력받음
        answerarrya =inputarry;
        answerarryb =inputarry;
        if (answerarry[0]==inputarry[0] &&answerarry[1]==inputarry[1]){
        }else if (answerarry[0]!=inputarry[0] && answerarry[1]==inputarry[1]){
            changeNumber(answerarrya[1],answerarrya[1]);
            changeNumber(answerarrya[0],answerarrya[0]);

            countA++;
        } else if (answerarry[0]!=inputarry[0] && answerarry[1]!=inputarry[1]) {
            changeNumber(answerarrya[1],answerarrya[1]);
            changeNumber(answerarrya[0],answerarrya[0]);
            countA++;
            changeNumber(answerarryb[1],answerarryb[1]);
            changeNumber(answerarryb[0],answerarryb[0]);
            countB++;
        }


    }
    private static String standardNumber(int answer,int a){
        if (answer==0){
            a = 1;

        }else
            a= 0;

        return null;
    }
    private static String changeNumber(int arry,int change){
        if (arry==0){
            change = 1;

        }else
            change = 0;

        return null;
    }






}
