package matrixTest;


// 1등은 6개
// 2등은 5개
// 3등은 4개
// 4등은 3개
// 꽝은 2개 이하


import java.util.Arrays;

public class LotoMatching {


    public static void main(String[] args) {
        
        int[][] arry = new int[5][6];
        int[][] arryMine = new int[1][6];

        creatArrayNumber(arry);
        creatArrayNumber(arryMine);

        ArraySort(arry);
        ArraySort(arryMine);

        printarry(arry);
        printarry(arryMine);

        for (int i = 0; i < arry.length; i++) {
            int count = 0;
            for (int k = 0; k< arry[i].length;k++) {
                for (int j = 0; j < arryMine[0].length; j++) {
                    if (arry[i][k] == arryMine[0][j]) {
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



    }

     static int [][] ArraySort(int[][]arrry) {
        int c=0;
        for (int i=0;i<arrry.length;i++){
            for (int j=0;j< arrry[i].length-1;j++){
                for (int k=j+1;k< arrry[i].length;k++){
                    if (arrry[i][j]>arrry[i][k]){
                         c = arrry[i][j];
                         arrry[i][j]= arrry[i][k];
                         arrry[i][k]= c;
                    }
                }

            }
        }


        return  arrry;
    }

    static void printarry(int[][] arry) {
        for (int r = 0; r < arry.length; r++) {
            for (int i = 0; i < arry[r].length; i++) {
                System.out.printf("%d\t", arry[r][i]);

            }
            System.out.println();
        }
        System.out.println();
    }


    static int[][] creatArrayNumber(int[][] arry) {
        for (int r = 0; r < arry.length; r++) {
            for (int i = 0; i < arry[r].length; i++) {
                arry[r][i] = (int) (Math.random() * 8) + 1;

                for (int j = 0; j < i; j++) {
                    if (arry[r][j] == arry[r][i]) {
                        i--;
                        break;

                    }
                }

            }
        }

        return arry;
    }
}
class LottoDraw {


}




