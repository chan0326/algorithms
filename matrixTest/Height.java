package matrixTest;

import java.util.Arrays;

public class Height {

    /**
     * 키가 height보다 큰 사람의 수를 구하는 함수
     * @param height
     * @param array
     * @return
     */
    public int solution(int height, int [] array){
        int answer = 0;
        for (int i : array){
            if (array[i] > height){
                answer++;
            }
        }
        return answer;
    }


    /**
     * 람다식을 사용한 방법
     * @param height
     * @param array
     * @return
     */
    public int solution2(int height, int [] array){

        return (int) java.util.Arrays.stream(array)
                .filter(i -> i > height)
                .count();
    }

    public static void main(String[] args) {

            Height height = new Height();
            int height1 = 170;
            int[] array = {160, 165, 170, 175, 180};
            System.out.println(height.solution(height1, array));
            System.out.println(height.solution2(height1, array));
    }
}
