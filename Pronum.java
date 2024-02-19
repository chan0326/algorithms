import java.util.Scanner;

public class Pronum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrIntger = new int[sc.nextInt()];
        for (int i = 0; i < arrIntger.length; i++) {
            arrIntger[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int same = 0;
        for (int i = 0; i < arrIntger.length; i++) {
            if (v == arrIntger[i])
                same++;
        }
        System.out.println(same);


    }
}
