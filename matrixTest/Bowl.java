package matrixTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bowl {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        int ansewer = 10;
        for (int i =1 ; i<a.length(); i++) {
            if (a.charAt(i) == a.charAt(i-1)){
                ansewer +=5;
            }else {
                ansewer +=10 ;
            }
        }
        System.out.println(ansewer);
    }
}
