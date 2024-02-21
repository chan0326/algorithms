package kaupOOP;

import menberOOP.MemberPerson;

import java.util.Scanner;

public class KaupView {



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MemberPerson ps =new MemberPerson(sc.nextInt(),sc.nextInt());


        // 카우프지수 구하는 프로그램을 작성해 주세요
        // 키 : 150~200 몸무게 : 30~99
        KaupService service = new KaupServiceImpl();
        ps.creatHeight();
        ps.creatWeight();
        double bmi = service.creatBmi();
        String bodyMass = service.creatBodymass();
        System.out.println("키 : "+ps.getHeight());
        System.out.println("이름 : "+ps.getName());
        System.out.println("몸무게 : "+ps.getWeight());
        System.out.printf("Bmi : %.1f",bmi);
        System.out.println();
        System.out.println("체질량 : "+ bodyMass);





    }
}
