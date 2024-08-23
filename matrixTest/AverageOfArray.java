package matrixTest;

public class AverageOfArray {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i=0 ; i<numbers.length ; i++ ){
            answer += numbers[i];
        }
        answer /= numbers.length ;
        return answer;
    }

    public static void main(String[] args) {
        AverageOfArray averageOfArray = new AverageOfArray();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(averageOfArray.solution(numbers));
    }
}
