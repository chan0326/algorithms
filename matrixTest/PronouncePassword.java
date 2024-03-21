package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class PronouncePassword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.next();
        char[] a = str.toCharArray();
        int [] arraayAnswer = new int[a.length];
        for (int i =0 ; i<a.length;i++){
            if (a[i] == 'a'){
                count++;
            }
        }
        for (int i =0; i<a.length; i++){
            int answer=0;
            for (int j =i;j<i+count;j++){
                 int foo= j%a.length;
                if (a[foo] == 'b'){
                    answer++;
                }
            }
            arraayAnswer[i]=answer;
        }
        Arrays.sort(arraayAnswer);
        System.out.println(arraayAnswer[0]);
//dd
    }
}
