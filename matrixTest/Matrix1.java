package matrixTest;

public class Matrix1 {
    public static void main(String[] args) {
        int [][] arry = new int[5][5];
        int k = 25;
        for (int i=0;i< arry.length;i++){
            for (int j= 0;j< arry.length;j++) {
                arry[i][j] =k;
                k--;
            }

        }
        for (int i =0; i<arry.length;i++){
            for (int j=0;j<arry[i].length;j++){
                System.out.printf(arry[i][j] + "");
            }
            System.out.println();
        }


    }
}
