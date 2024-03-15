import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = new char[]{'a', 'i', 'o', 'u', 'e'};


        String str;
        while (!(str = sc.next()).equals("end")) {
            char[] b = str.toCharArray();
            char[] c = b;
            boolean k = true;
            boolean boo = false;
            int foo = 0;


            for (int i = 0; i < b.length; i++) {
                if (b[i] == 'a' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u' || b[i] == 'e') {
                    boo = true;
                    c[i] = 'a';
                } else {
                    c[i] = 'b';
                }
            }


            for (int i = 0; i < b.length - 1; i++) {
                if (b[i] == b[i+1]) {
                    k=false;
                    System.out.println("2");
                }
            }
            for (int i = 0; i < b.length - 1; i++) {
                if (b[i] == 'e' && b[i+1] == 'e') {
                    k=true;
                    System.out.println("2-1");
                }
            }
//        for (int i = 0; i < b.length-2; i++) {
//            for (int j =0; j <chars.length; j++){
//            if ( b[i+1] == chars[j] && b[i+2] ==chars[j]){
//                k = false;
//                System.out.println("<" + str + "> is not acceptable.3.");
//            }
//            }
//        }
//        for (int i = 0; i < b.length-2; i++) {
//            for (int j =0; j <allchars.length; j++){
//                if (b[i]==allchars[j] && b[i+1] == allchars[j] && b[i+2] == allchars[j]){
//                    k = false;
//                    System.out.println("<" + str + "> is not acceptable.3.");
//                }
//            }
//        }
//            for (int i = 0; i < b.length; i++) {
//                for (int j = 0; j < chars.length; j++) {
//                    if (b[i] == chars[j]) {
//                        c[i] = 'a';
//                    } else {
//                        c[i] = 'b';
//                    }
//                }
//            }

            for (int i = 0; i < c.length - 2; i++) {
                if (c[i] == c[i + 1] && c[i + 1] == c[i + 2] && c[i] == c[i + 2]) {
                    k = false;
                    System.out.println(c[i]);
                    System.out.println("<" + str + "> is not acceptable.3");
                }
            }

            if (k == true && boo == true) {
                System.out.println("<" + str + "> is acceptable.4");
            } else {
                System.out.println("<" + str + "> is not acceptable.5");
            }
        }
    }
}







