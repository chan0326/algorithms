package matrixTest;

public class PizzaSlice {

    /**
     * 피자를 n명이 먹는다고 할 때, 피자를 몇 조각으로 나눠야 하는지 구하는 함수
     * @param slice
     * @param n
     * @return
     */
    public int solution(int slice ,int n ){
        return n%slice==0? n/slice : n/slice+1;



    }

    public static void main(String[] args) {
        PizzaSlice pizzaSlice = new PizzaSlice();
        int slice = 8;
        int n = 30;
        System.out.println(pizzaSlice.solution(slice,n));
    }
}
