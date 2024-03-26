package matrixTest;

import java.util.Scanner;

public class DigitalTV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 =0;
        int count2 =0;
        String [] strings = new String[sc.nextInt()];
        for (int i =0;i<strings.length;i++){
            strings[i]= sc.next();
        }
        for (int i=0;i<strings.length;i++){
            count1++;
            if (strings[i].equals("KBS1")){
                break;
            }
        }
        for (int i=0;i<strings.length;i++){
            count2++;
            if (strings[i].equals("KBS2")){
                break;
            }
        }
        if (strings.length-count1<count1){

        }else {}



    }
}
