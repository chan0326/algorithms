package matrixTest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();
        int y= sc.nextInt();
        int w= sc.nextInt();
        int h= sc.nextInt();

        int xw= w-x;
        int yh = h-y;

        int [] array = new int[4];
        array[0]=x;
        array[1]=y;
        array[2]=xw;
        array[3]=yh;

        Arrays.sort(array);
        System.out.println(array[0]);




    }
}