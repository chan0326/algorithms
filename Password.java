import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char [] allchars = new char[]{'o','e'};
        char [] chars  = new char[]{'a', 'i', 'o', 'u', 'e'};

        String str =(sc.next());
        char [] b =str.toCharArray();
        System.out.println(b);


        for (char i:b){
            if (i != 'a' && i!= 'i' && i!= 'o' && i!= 'u' && i!= 'e' ){
                System.out.println("<"+str+"> is not acceptable.1.");
                break;}

            }
//            if (b.length>=3 && b[i] == b[i] && b[1]==b[]){
//                if (arrayList.get(i) == allchars && arrayList.get(i+1) == allchars){
//                    System.out.println("<"+str+"> is acceptable.2.");
//                    break;
//                }else {System.out.println("<"+str+"> is not acceptable.3.");
//                break;}
//
//            }else {System.out.println("<"+str+"> is acceptable.4.");}

        }




    }
}
