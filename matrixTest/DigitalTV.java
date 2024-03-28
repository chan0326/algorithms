package matrixTest;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalTV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counti1ndex=0 ;
        int count2index=0 ;
        String temp = "";
        ArrayList arry = new ArrayList<>();
        String [] strings = new String[sc.nextInt()];
        for (int i =0;i<strings.length;i++){
            strings[i]= sc.next();
        }
        for (int i=0;i<strings.length;i++){

            if (strings[i].equals("KBS1")){
                counti1ndex =i;
            }



            if (strings[i].equals("KBS2")){
                count2index =i;
            }
        }

        if (count2index>counti1ndex){
            for (int i=0;i<counti1ndex;i++){
                arry.add("1");
            }
            for (int i=counti1ndex;i>0;i--){
                arry.add("4");
            }
            temp=strings[0];
            strings[0]= temp;
            strings[counti1ndex]=temp;
            for (int i=0;i<count2index;i++){
                arry.add("1");
            }
            for (int i=count2index;i>1;i--){
                arry.add("4");
            }
        }








    }
}
