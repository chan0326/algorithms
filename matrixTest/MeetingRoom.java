package matrixTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MeetingRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] array = new int[N][2];
        for (int i = 0; i < N; i++) {
            array[i][0] = sc.nextInt(); //시작시간
            array[i][1] = sc.nextInt(); //종료시간
        }

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                else return o1[1] - o2[1];
            }
        });


//      --구시대적 방법---
//        int temp;
//        for (int i = 0; i < N; i++) {
//            for (int j = i; j < N; j++) {
//                if (array[i][1] > array[j][1]) {
//                    temp = array[i][0];
//                    array[i][0] = array[j][0];
//                    array[j][0] = temp;
//                    temp = array[i][1];
//                    array[i][1] = array[j][1];
//                    array[j][1] = temp;
//                }
//            }
//        }
//
//
//        int c;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i][1] == array[j][1]) {
//                    if (array[i][0] > array[j][0]) {
//                        c = array[i][0];
//                        array[i][0] = array[j][0];
//                        array[j][0] = c;
//                        c = array[i][1];
//                        array[i][1] = array[j][1];
//                        array[j][1] = c;
//                    }
//                }
//            }
//        }

        // ---종료시간 오름차순정렬완료----

        int count = 1;
        int choice;
        choice = array[0][1];
        for (int i = 1; i < N; i++) {
            if (choice <= array[i][0]) {
                choice = array[i][1];
                count++;
            }
        }
        System.out.println(count);

    }
}
