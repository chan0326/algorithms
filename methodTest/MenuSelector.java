package methodTest;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class MenuSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[메뉴] 0.종료 1.생성 2.수정");
            String menu = sc.next();
//            if (menu.equals("0")) {
//                System.out.println(" 테스트");
//                return;
//            } else {
//                System.out.println(" 생성 ");
//                continue;
//
//            }
            switch (menu){
                case "0":
                    System.out.println("종료");
                case "1":
                    System.out.println("생성");
                    break;
                case "2":
                    System.out.println("수정");
                    break;
            }

        }
    }
}
