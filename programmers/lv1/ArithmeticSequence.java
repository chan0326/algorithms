package programmers.lv1;

/*
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 */
public class ArithmeticSequence {

    public long solution(int a, int b) {
        long answer = 0;
        long i = 0;

        if(a>b){
            i = b;
        }else{
            i = a;
        }


        while(true){

            if(i > a && i >b){
                break;
            }
            answer += i;
            i= i+1;
        }
        return answer;
    }

    /**
     * 다른 사람 풀이
     *  등차수열 공식 이용
     * @param a
     * @param b
     * @return
     */
    public long solution2(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    public static void main(String[] args) {


        ArithmeticSequence arithmeticSequence = new ArithmeticSequence();
        int a = 3;
        int b = 5;
        System.out.println(arithmeticSequence.solution(a, b));
    }
}
