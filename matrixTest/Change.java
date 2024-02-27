package matrixTest;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int count = 0;
        money = 1000-money;
        if (money/500>0){
           count += money/500;
           money = money%500;
        }else {}
        if (money/100>0){
            count += money/100;
            money = money%100;
        }else {}
        if (money/50>0){
            count +=money/50;
            money = money%50;
        }else {}
        if (money/10>0){
            count +=money/10;
            money = money%10;
        }else {}
        if (money/5>0){
            count +=money/5;
            money = money%5;
        }else {}
        if (money/1>0){
            count +=money/1;
        }else {}
        System.out.println(count);
    }
}
