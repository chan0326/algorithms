package mathTest;

import java.util.Scanner;


public class Howold {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int old = inputOld(sc);
        System.out.println("나이"+old );

    }

    static int inputOld(Scanner sc) {
        System.out.println("나이는 ?");
        return sc.nextInt();
    }
}
