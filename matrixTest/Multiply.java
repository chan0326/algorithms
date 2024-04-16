package matrixTest;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int foo=sc.nextInt();
        int boo= sc.nextInt();

        int booFrist= boo%10;
        int booS = boo%100/10;
        int booT = boo/100;

        int fanswer=foo*booFrist;
        int sanswer=foo*booS;
        int tanswer=foo*booT;

        int answer = tanswer*100+sanswer*10+fanswer;

        System.out.println(fanswer);
        System.out.println(sanswer);
        System.out.println(tanswer);
        System.out.println(answer);

    }
}
