package matrixTest;

import java.util.Arrays;

public class Median {

    /**
     * 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해주세요.
     * @param array
     * @return
     */
public int solution(int[] array) {
        int answer = 0;
        int len = array.length;
        Arrays.sort(array);
        if (len % 2 == 0) {
            answer = array[len /2 - 1];
        } else {
            answer = array[len / 2];
        }

        return answer;
}


    public static void main(String[] args) {
        Median median = new Median();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(median.solution(arr));
    }

}
