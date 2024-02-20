import java.util.Scanner;

public class Multidimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음시험에서 2개반의 평균 점수를 구하시오");
        System.out.println("시험에 응시한 학생수는 몇명입니까?");
        System.out.println("1반 학생수");
        int studentNum = sc.nextInt();
        System.out.println("2반 학생수");
        int studentNum2 = sc.nextInt();
        int[] scores2 = new int[studentNum2];
        int[] scores = new int[studentNum];
        int avg =0 ;
        int max =0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int)(Math.random()*100);
            avg += scores[i];
            System.out.println(scores[i]);
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        avg /=scores.length;

        int avg2 =0;
        int max2 =0;
        for (int i = 0; i < scores2.length; i++) {
            scores2[i] = (int)(Math.random()*100);
            avg2 =avg2 + scores2[i];
            System.out.println(scores[i]);
            if (max2 < scores[i]) {
                max2 = scores[i];
            }
        }
        avg2=avg2/scores2.length;

        System.out.printf("1반 평균점수: %d  최대점수: %d" ,avg, max);
        System.out.printf("2반 평균점수: %d  최대점수: %d" ,avg2, max2);
    }
}
