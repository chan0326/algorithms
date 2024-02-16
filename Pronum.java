import java.util.Scanner;

public class Pronum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수의 개수 입력");
        int[] arrIntger = new int[sc.nextInt()];
        for (int i = 0; i < arrIntger.length; i++) {
            arrIntger[i] = sc.nextInt();
        }
        System.out.println("찾으려는 정수 입력");
        int v = sc.nextInt();
        int same = 0;
        for (int i = 0; i < arrIntger.length; i++) {
            if (v == arrIntger[i])
                same++;
        }
        System.out.println(same);


    }
}
