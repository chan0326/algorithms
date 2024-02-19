import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("9개의 수가 주어질때 오름차순으로 7개를 나타내라");
        int[] arry1 = new int[9];
        int sum = 0;
        for (int i = 0; i < arry1.length; i++) {
            arry1[i] = sc.nextInt();
            sum += arry1[i];
        }
        int c =0;

        for (int j = 0; j < 8; j++) {
            for (int i = 1; i < 9; i++) {
                if (sum - arry1[j] - arry1[i] == 100) {

                    arry1[j] = 100;
                    arry1[i] = 100;
                    break;
                }






            }
        }
        for (int a = 0; a < 8; a++) {
            for (int b = 1; b < 9; b++) {
                if (arry1[a] > arry1[b]) {
                    arry1[c] = arry1[a];
                    arry1[a] = arry1[b];
                    arry1[b] = arry1[c];
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(arry1[i]);
        }
    }


}







