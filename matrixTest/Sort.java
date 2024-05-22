package matrixTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sort {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(bf.readLine());
        ArrayList arr = new ArrayList();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(arr);

        for (int i = 0; i < n; i++) {
            sb.append(arr.get(i)).append("\n");
        }
        System.out.println(sb);




    }
}
