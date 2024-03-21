package matrixTest;


import java.util.Scanner;

public class Oven_clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int min = sc.nextInt();
        int run = sc.nextInt();

        if (run>=60){
            time+=(run/60);
            run = run%60;

        }
        min +=run;
        if (min>=60){
            time+=(min/60);
            min= min%60;
        }

        if (time >=24 )
        {time = time%24;}
        System.out.println(time+" "+min);



    }
}
