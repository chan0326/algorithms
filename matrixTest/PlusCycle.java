package matrixTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = a;
        int cycle = 0;

        do{
            a = ((a%10)*10)+ (((a/10)+(a%10))%10);
            cycle++;
        }while(b != a);

        System.out.println(cycle);
    }






}
