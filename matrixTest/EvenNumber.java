package matrixTest;

public class EvenNumber {

    /**
     * 1부터 n까지의 홀수를 배열로 반환하는 함수
     * @param n
     * @return
     */
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                answer[i/2] = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        EvenNumber evenNumber = new EvenNumber();
        int n = 10;
        int[] result = evenNumber.solution(n);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
