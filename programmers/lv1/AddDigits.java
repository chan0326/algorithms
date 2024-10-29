package programmers.lv1;

/**
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 */
public class AddDigits {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for (int i = 0 ; i<s.length(); i++){
            int a = s.charAt(i) - '0';
            answer += a;
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0;
        int let = (int) Math.log10(n) +1;

        for (int i = 0 ; i<let ; i++){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        int n = 12323423;
        System.out.println(addDigits.solution2(n));
    }



}
