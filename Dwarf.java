
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
        int c;
        for (int i = 0; i < 9; i++) {
            for (int j = i; j < 9; j++) {
                if (arry1[i] > arry1[j]) {
                    c = arry1[i];
                    arry1[i] = arry1[j];
                    arry1[j] = c;
                }
            }
        }


        int a = 0;
        int b = 0;

        for (int j = 0; j < 9; j++) {
            for (int i = 1; i < 9; i++) {
                if (sum - (arry1[j] + arry1[i]) == 100) {
                    a = arry1[j];
                    b = arry1[i];
                    break;


                }


            }
        }


        for (int i = 0; i < arry1.length; i++) {
            if (arry1[i] != a && arry1[i] != b) {
                System.out.println(arry1[i]);
            }
        }
    }


}