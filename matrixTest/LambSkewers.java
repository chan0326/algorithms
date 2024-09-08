package matrixTest;

public class LambSkewers {
    /**
     * 양꼬치 n개와 음료 k개를 주문할 때, 가격을 계산하는 함수
     * 양꼬치 한 개의 가격은 12000원, 음료 한 개의 가격은 2000원
     * 양꼬치를 10인분 이상 주문 할때 마다 음료 1개를 무료로 제공한다.
     * @param n
     * @param k
     * @return
     */
    public int solution(int n, int k) {
        k = k-(n/10) ;
        return n*12000 + k*2000;
    }

    /**
     * * 객체지향을 사용하여 푼 풀이!
     * @param n
     * @param k
     * @return
     */
    public int solution2(int n, int k) {
        int lambTotalPrice = totalPrice(Menu.LAMB, n);
        int drinkTotalPrice = totalPrice(Menu.DRINK, k);
        int discountPrice = discount(Menu.DRINK, n);

        int totalPay = lambTotalPrice + drinkTotalPrice - discountPrice;
        return totalPay;
    }

    private int totalPrice(Menu menu, int quantity) {
        return menu.getPrice() * quantity;
    }

    private int discount(Menu menu, int lambQuantity) {
        // 양꼬치 10인분에 음료수 하나
        int point = lambQuantity / 10;

        return menu.getPrice() * point;
    }
}

enum Menu {

    LAMB("양꼬치", 12000),
    DRINK("음료수", 2000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        LambSkewers lambSkewers = new LambSkewers();
        int n = 178;
        int k = 15;
        System.out.println(lambSkewers.solution(n,k));
    }

}
