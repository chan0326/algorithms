package matrixTest;

public class Drainage {
    /**
     * 자연수 num이 매개변수로 주어집니다.
     * num이 n의 배수이면 1을 return 하고, n의 배수가 아니면 0을 return 하는 solution 함수를 완성해주세요.
     */
    public int solution(int num, int n) {
        int answer = 0;
        if(num%n==0){
            answer = 1;
        }else{
            answer= 0;
        }
        return answer;
    }
    /**
     * 삼항연산자를 사용한 방법
     * @param num
     * @param n
     * @return
     */
    public int solution2(int num, int n) {
        return num%n==0?1:0;
    }

    public static void main(String[] args) {
        Drainage drainage = new Drainage();
        int num = 10;
        int n = 5;
        System.out.println(drainage.solution2(num, n));
    }
}
