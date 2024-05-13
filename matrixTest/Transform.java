package matrixTest;

import java.util.Scanner;

public class Transform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        int h = sc.nextInt();

        int w  = sc.nextInt();

        double answer = Math.sqrt(1.0*d*d/(h*h+w*w));
        System.out.println((int)Math.floor(answer*h)+" "+(int)Math.floor(answer*w));

    }
}
