package matrixTest;


// 1등은 6개
// 2등은 5개
// 3등은 4개
// 4등은 3개
// 꽝은 2개 이하

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static matrixTest.Lotto.*;

public class LotoMatching {
    public static void main(String[] args) {
        int arryMine[][] = new int[2][];
        creatArrayNumber();
        creatArrayNumber1();
        sortArry();
        sortArry();
        printLoTTo(r);
        System.out.println();
        printLoTTo();
        System.out.println();

        Arrays.sort(r);
        Arrays.sort(arryMine);
        int count = 0;
        for (int i = 0; i < arryAnswer.length; i++) {
            for (int j = 0; j < arryMine.length; j++) {
                if (arryAnswer[i] == arryMine[j]) {
                    count++;
                } else {
                }
            }
        }
        switch (count) {
            case 1:
            case 2:
                System.out.println("꽝입니다");
                break;
            case 3:
                System.out.println("4등입니다");
                break;
            case 4:
                System.out.println("3등입니다");
                break;
            case 5:
                System.out.println("2등입니다");
                break;
            case 6:
                System.out.println("1등입니다");
                break;
        }
    }

    static int[][] creatArrayNumber1(int[r][] arry) {

    for (int k=0;k<r;k++) {
        for (int i = 0; i < arry.length; i++) {
            boolean check = false;
            arry[k][i] = (int) (Math.random() * 45 + 1);
            for (int j = 0; j < arry.length; j++) {


                if (arry[k][i] ==arry[k][j] &&i != j){
                    check = true;

                } else{
                }
            }


            if (check == false) {


            } else {
                i--;

            }


        }
    }
        return arry;

    }


}


