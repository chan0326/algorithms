import java.util.Scanner;

public class Arraytest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("arr 의 길이: " + arr.length);

        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                System.out.println(arr[i]);
            } else {
            }
        }


    }
}

