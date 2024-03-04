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
            array[i][0]= sc.nextInt();
            array[i][1]= sc.nextInt();
        }
        Arrays.sort(array, Comparator.comparingInt((int[] o) -> o[1]));
        for (int i=0 ; i<N; i++){
//            System.out.println(Arrays.toString(array[i]));

        }
        int[] temp;
//        for (int i = 0; i < N; i++) {
//            for (int j = i+1; j < N; j++)
//                if (array[i][1] > array[j][1]) {
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                    System.out.println(Arrays.deepToString(array));
//                }
//        }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++)
                if (array[i][1] == array[j][1]) {
                    if (array[i][0] > array[j][0]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        System.out.println(Arrays.deepToString(array));
                    }
                }
        }

        // 종료시간 오름차순정렬완료
        int count = 0;
        int [][] choice = new int[1][2];
        choice[0]= array[0];
        for (int i=1; i<N;i++){
                if (choice[0][1]<=array[i][0]) {
                    count++;
                    choice[0]= array[i];
                    break;



            }
        }

    }
}
