package matrixTest;

import java.util.Scanner;

public class LightBulbSwitch {
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
        for (int i=0;i<N;i++){
            if (answerarry[0]==0){
                answerarrya[0]=1; // 바꾸기
                answerarrya[1]=1;
            }else {
                answerarryb[0]=1; // 안바꾸기
                answerarryb[1]=1;

            }



        }






    }




}
