package matrixTest;

import java.util.Arrays;

public class ArraysDouble {

    /**
     *  정수 배열 numbers가 매개변수로 주어질 때, 각 원소에 2를 곱한 배열을 return 하도록 solution 함수를 완성해주세요.
     * @param numbers
     * @return
     */
    public int[] solution(int [] numbers){
        return Arrays.stream(numbers)
                .map(i -> i * 2)
                .toArray();
    }

    public static void main(String[] args) {
        ArraysDouble arraysDouble = new ArraysDouble();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = arraysDouble.solution(numbers);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
