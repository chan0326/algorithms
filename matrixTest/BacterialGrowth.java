package matrixTest;

public class BacterialGrowth {

    /**
     *  미생물이 n개 있을 때, t시간 후 미생물의 수를 구하는 함수
     *  1시간 마다 2배 증가하는 미생물
     * @param n
     * @param t
     * @return
     */
    public int solution(int n, int t) {
        for ( int i= 0 ; i<t; i++){
            n *= 2;
        }
        return n;
    }


}
