package methodTest;

import java.util.Scanner;

public class Randomname {
    static String inputlastnames(Scanner sc){
        System.out.println("학생 이름 :"  );
        return  sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = inputlastnames(sc);
        System.out.println("이름은"+ name);

    }
}
