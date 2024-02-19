import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("9개의 수가 주어질때 오름차순으로 7개를 나타내라");
        int[] arry1 = new int[9];
        for (int i = 0; i < arry1.length; i++) {
            arry1[i] = sc.nextInt();

        }

        for (int i = 0; i < arry1.length-1; i++) {
            if (arry1[i] > arry1[i+1]) {
                arry1[i] = arry1[i + 1];
                arry1[i + 1] = arry1[i];
            }
        }
        System.out.println(Arrays.toString(arry1));


    }
}