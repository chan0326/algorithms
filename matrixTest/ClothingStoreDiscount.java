package matrixTest;

public class ClothingStoreDiscount {

    /**
     *  가격에 따른 할인 금액을 구하는 함수
     *  100,000원 이상 300,000원 미만 구매시 5% 할인
     *  300,000원 이상 500,000원 미만 구매시 10% 할인
     *  500,000원 이상 구매시 20% 할인
     * @param price
     * @return
     */
    public int solution(int price) {
        double answer = price;
        if (answer >=500000 ){
            answer = answer - (answer * 0.2);
        }
        else if (answer>=300000) {
            answer = answer - answer * 0.1;
        }
        else if (answer>=100000) {
            answer = answer - answer * 0.05;
        }
        price = (int) answer;
        return price;
    }

    /**
     * 삼항 연산자 사용
     * @param price
     * @return
     */
    public int solution2(int price) {
        int answer = 0;
        double ratio=((price>=500000)?(0.8):((price>=300000)?(0.9):((price>=100000)?(0.95):(1.0))));
        answer = (int)(price*ratio);
        return answer;
    }

    public static void main(String[] args) {
        ClothingStoreDiscount clothingStoreDiscount = new ClothingStoreDiscount();
        int price = 400000;
        System.out.println(clothingStoreDiscount.solution(price));
        System.out.println(clothingStoreDiscount.solution2(price));
    }
}
