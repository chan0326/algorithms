package matrixTest;

import java.util.Arrays;

public class TrimArray {

    /**
     * stream 사용
     * 정수 배열 numbers와 두 정수 num1, num2가 매개변수로 주어질 때, numbers 배열의 num1번째부터 num2번째까지의 원소를 return 하도록 solution 함수를 완성해주세요.
     * @param numbers
     * @param num1
     * @param num2
     * @return
     */
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    /**
     * for문 사용
     * @param numbers
     * @param num1
     * @param num2
     * @return
     */
    public int[] solution2(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        TrimArray trimArray = new TrimArray();
        trimArray.solution(new int[]{1, 2, 3, 4, 5}, 1, 3);
        System.out.printf("solution: %s\n", Arrays.toString(trimArray.solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
    }
}
