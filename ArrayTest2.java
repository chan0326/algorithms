import java.util.Scanner;

public class ArrayTest2 {
    /***
     * 최적화 문제 중 최대값 구하기
     ***/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("다음시험에서 1등 학생의 이름과 점수를 구하시오");
        //int[] arr = null;
        //arr= new int[2];
        System.out.println("시험에 응시한 학생수는 몇명입니까?");
        System.out.println("응시한 학생의 이름을 입력하시오");
        int number = sc.nextInt();
        int[] scores = new int[number];
        String[] names = new String[number];
        int max = 0;
        int namesIndex = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("점수를 입력하시오");
            scores[i] = sc.nextInt();
            System.out.println("이름을 입려갛시오");
            names[i] = sc.next();
            if (max < scores[i]) {
                max = scores[i];
                namesIndex = i;
            }
        }

        System.out.println("최대점수는" + max+"학생이름은"+names[namesIndex]);


//        for ( int i =0; i<2; i++){
//        System.out.println("자연수를 입력하시오");
//        System.out.println(sc.next());

    }


}

