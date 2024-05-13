package matrixTest;

import java.util.*;

public class WordLength {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//
//        sc.close();
//
//        StringTokenizer st = new StringTokenizer(str," ");
//        System.out.println(st.countTokens());
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        if (strArr.length == 0) {
            System.out.println(0);
            System.exit(0);
        }
        if (strArr[0].isEmpty()) {
            System.out.println(strArr.length - 1);
        }  else {
            System.out.println(strArr.length);
        }

    }
}
