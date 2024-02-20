package menberOOP;

import java.util.Scanner;

public class MemberView {


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);



        System.out.println("id를 입력해주세요");
        String id = sc.next();

        System.out.println("비밀번호를 입력해주세요");
        String pw = sc.next();

        System.out.println("비밀번호를 한번 더 입력해주세요");
        String pwAgain = sc.next();

        System.out.println("이름를 입력해주세요");
        String name = sc.next();

        System.out.println("주민번호를 입력해주세요");
        String personId = sc.next();

        System.out.println("전화번호를 입력해주세요");
        String phoneNumber = sc.next();

        System.out.println("주소를 입력해주세요");
        String address = sc.next();

        System.out.println("직업을 입력해주세요");
        String job = sc.next();

        MemberPerson mp = new MemberPerson();

        mp.setId(id);
        mp.setPw(pw);
        mp.setPwAgain(pwAgain);
        mp.setName(name);
        mp.setAdress(address);
        mp.setJob(job);
        mp.setPersonID(personId);
        mp.setPhoneNumber(phoneNumber);



        System.out.println("ID : " + mp.getId());
        System.out.println("비 번 : " + mp.getPw());
        System.out.println("비번확인 : " + mp.getPwAgain());
        System.out.println("이 름 : " + mp.getName());
        System.out.println("주민번호 : " + mp.getPersonID());
        System.out.println("전화번호 : " + mp.getPhoneNumber());
        System.out.println("주 소 : " + mp.getAdress());
        System.out.println("직업 : " + mp.getJob());

    }

}