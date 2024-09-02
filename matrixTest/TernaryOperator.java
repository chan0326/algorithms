package matrixTest;

public class TernaryOperator {
    public int solution(int a, int b, boolean flag) {
        return flag == true? a+b: a-b;
    }

    public static void main(String[] args) {
        TernaryOperator ternaryOperator = new TernaryOperator();
        int a = 10;
        int b = 5;
        boolean flag = true;
        System.out.println(ternaryOperator.solution(a, b, flag));
    }
}
