package methodTest;

public class RandomTest {
    static String returnRandom(String lastName){
        return "에릭"+" "+ lastName ;
    }
    public static void main(String[] args) {
        String lastName = "감마";
        String randomNumber = returnRandom(lastName);
        System.out.println("리턴 한 값은:"+randomNumber);
    }
}
