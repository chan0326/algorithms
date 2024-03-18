
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        while (!(str = sc.next()).equals("end")) {
            char[] b = str.toCharArray();
            char[] c = str.toCharArray();
            boolean k = true;
            boolean boo = false;


            for (int i = 0; i < b.length; i++) {
                if (b[i] == 'a' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u' || b[i] == 'e') {
                    boo = true;
                    c[i] = 'a';
                }
                else {
                    c[i] = 'b';
                }
            }


            for (int j = 0; j < b.length - 1; j++) {
                if (b[j] == b[j+1]) {
                    boo=false;
                    if (b[j] == 'e' || b[j] == 'o'){boo=true;
                        }
                }
            }

            for (int i = 0; i < c.length - 2; i++) {
                if (c[i] == c[i + 1] && c[i + 1] == c[i + 2] && c[i] == c[i + 2]) {
                    k = false;
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







