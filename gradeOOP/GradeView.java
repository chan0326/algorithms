package gradeOOP;
import java.util.Scanner;

public class GradeView {

    //static  String test; // 고정된 변수 =>말이 이상해서 상수라고 함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        String name = sc.next();
        GradePerson gp= new GradePerson();
        gp.setName(name);
        gp.createKoreanScore();
        gp.createEnglishScore();
        gp.createMathScore();
        gp.createAvgScore();



        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : "+gp.getName());
        System.out.println("국어점수 : "+gp.getKoreanScore());
        System.out.println("영어점수 : "+gp.getEnglishScore());
        System.out.println("수학점수 : "+gp.getMathScore());
        System.out.printf("평균 점수: %.1f",gp.getAvgScore());

    }
}