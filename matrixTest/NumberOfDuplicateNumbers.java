package matrixTest;

public class NumberOfDuplicateNumbers {


    /**
     * 정수 배열 array와 정수 n이 매개변수로 주어집니다.
     * array에서 n의 개수를 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution( int[] array, int n){

        int answer = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] == n){
                answer++;
            }
        }
        return answer;

    }

    /**
     * 람다식을 사용한 방법
     * @param array
     * @param n
     * @return
     */
    public int solution2(int[] array, int n){
        return (int) java.util.Arrays.stream(array)
                .filter(i -> i == n)
                .count();
    }




    public static void main(String[] args) {

        NumberOfDuplicateNumbers numberOfDuplicateNumbers = new NumberOfDuplicateNumbers();
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(numberOfDuplicateNumbers.solution(array, n));
        System.out.println(numberOfDuplicateNumbers.solution2(array, n));

    }
}
