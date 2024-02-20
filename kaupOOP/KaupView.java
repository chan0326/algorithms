package kaupOOP;

import java.util.Scanner;

public class KaupView {



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Person ps =new Person();


        // 카우프지수 구하는 프로그램을 작성해 주세요
        // 키 : 150~200 몸무게 : 30~99
        String name = sc.next();

        ps.setName(name);
        ps.creatHeight();
        ps.creatWeight();
        ps.creatBmi();
        ps.creatBodymass();
        System.out.println("키 : "+ps.getHeight());
        System.out.println("이름 : "+ps.getName());
        System.out.printf("Bmi : %.1f",ps.getBmi());
        System.out.println();
        System.out.println("체질량 : "+ps.getBodyMass());





    }
}
