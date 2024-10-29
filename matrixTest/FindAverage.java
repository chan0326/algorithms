package matrixTest;

/**
 * programmers.lv1. 평균 구하기
 * 문제 설명
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 */
public class FindAverage {

    public double solution(int[] arr) {
        double answer = 0;
        for (int i =0 ; i<arr.length; i++){
            answer += arr[i];
        }
        answer /=  arr.length ;
        return answer;
    }

    /**
     * stream을 이용한 방법
     * @param arr
     * @return
     */

    public int solution2(int[] arr) {
        return (int) java.util.Arrays.stream(arr).average().orElse(0);
    }

    public static void main(String[] args) {
        FindAverage findAverage = new FindAverage();
        int[] arr = {1, 2, 3, 4};
        System.out.println(findAverage.solution(arr));
        System.out.println(findAverage.solution2(arr));
    }
}
