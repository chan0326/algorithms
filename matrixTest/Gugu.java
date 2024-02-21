package matrixTest;

public class Gugu {


    public static void main(String[] args) {
        int arry[][] = new int[10][10];
        for (int i = 2; i < arry.length; i++) {
            for (int j = 1; j < arry.length; j++) {
                arry[i][j] = i * j;


            }


        }

        for (int i = 2; i < arry.length; i++) {
            for (int j = 1; j < arry[i].length; j++) {
                if (arry[i][j] >= 10) {
                    System.out.printf("%d * %d =  %s  ", i, j, arry[i][j] + "");
                } else {
                    System.out.printf("%d * %d =  %s  ", i, j, arry[i][j] + " ");
                }

            }
            System.out.println();
        }


    }
}

