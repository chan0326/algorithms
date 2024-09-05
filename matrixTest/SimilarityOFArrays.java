package matrixTest;

import java.util.Arrays;

public class SimilarityOFArrays {


    /**
     * 문자열 배열 arr1, arr2가 매개변수로 주어질 때, arr1과 arr2의 중복되는 원소의 개수를 return 하도록 solution 함수를 완성해주세요.
     * @param arr1
     * @param arr2
     * @return
     */
    public int solution(String[] arr1, String[] arr2) {
        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    answer++;
                }
            }
        }
        return answer;


    }


    /**
     * 람다식을 사용한 방법
     * @param arr1
     * @param arr2
     * @return
     */
    public int solution2(String[] arr1, String[] arr2) {

        return (int) Arrays.stream(arr1)
                .filter(i -> Arrays.asList(arr2).contains(i))
                .count();


    }


    public static void main(String[] args) {

        SimilarityOFArrays similarityOFArrays = new SimilarityOFArrays();
        String[] arr1 = {"a", "b", "c", "d"};
        String[] arr2 = {"ac", "bd", "b", "ina"};

        System.out.println(similarityOFArrays.solution(arr1, arr2));

    }
}
