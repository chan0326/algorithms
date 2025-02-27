package programmers.lv1;

/**
 * LV 1. 짝수와 홀수
 * 문제 설명
 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * num은 int 범위의 정수입니다.
 * 0은 짝수입니다.
 */
public class EvenAndOddNumbers {
    public String solution(int num) {

        return (num %2 ==0) ? "Even" : "Odd" ;
    }

    public static void main(String[] args) {
        EvenAndOddNumbers evenAndOddNumbers = new EvenAndOddNumbers();
        int num = 3;
        System.out.println(evenAndOddNumbers.solution(num));
    }
}
