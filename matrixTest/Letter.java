package matrixTest;

public class Letter {


    public int solution(String message) {
        return message.length()*2;
    }

    // 다른 방법 null 처리
    public int solution2(String message) {
        if (message != null) {
            return message.length()*2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        String message = "Hello, World!";
        System.out.println(letter.solution(message));
    }
}
