package methodTest;

import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = Randomname.inputlastnames(sc);
        int age = Howold.inputOld(sc);
        System.out.printf("이름: %s, 나이는: %d",name,age);
    }
}
