package matrixTest;

public class ListLength {

    /**
     * 문자열로 이루어진 리스트 strList가 매개변수로 주어질 때, 각 문자열의 길이를 담은 배열을 return 하도록 solution 함수를 완성해주세요.
     * @param strlist
     * @return
     */

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    /**
     * 람다식을 사용한 방법
     * @param strlist
     * @return
     */
    public int[] solution2(String[] strlist) {
        return java.util.Arrays.stream(strlist)
                .mapToInt(String::length) // .mapToInt(i -> i.length()) 문자열의 길이를 int로 변환
                .toArray(); // int 배열로 변환
    }

    public static void main(String[] args) {
        ListLength listLength = new ListLength();
        String[] strlist = {"abc", "de", "fgh"};
        int[] result = listLength.solution(strlist);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
