package matrixTest;

import java.util.stream.IntStream;


/**
 * 자연수 n이 매개변수로 주어집니다.
 * n 이하의 자연수 중에서 2의 배수만 더한 값을 return 하는 solution 함수를 완성해주세요.
 */
public class SumOfEvenNumbers {
    public int solution(int n) {
        int answer = 0;
        for (int i= 2 ; i<n+1; i++){
            if (i%2==0){
                answer = answer+ i;
            }
        }
        return answer;
    }

    /**
     * IntStream.rangeClosed(0,n) : 0부터 n까지의 숫자를 생성
     * @param n
     * @return
     */
    public int solution2(int n) {
        return IntStream.rangeClosed(0,n)
                .filter(i -> i%2==0)
                .sum();
    }

    public static void main(String[] args) {
        SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();

        int n = 10;
        System.out.println(sumOfEvenNumbers.solution(n));
        System.out.println(sumOfEvenNumbers.solution2(n));
    }
}
