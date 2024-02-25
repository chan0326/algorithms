package matrixTest;

public class LottoMake {public static void main(String[] args) {
    int lotto[][] = new int [4][6]; //5줄에 로또번호를 6개를 생성
    int row = 0;
    int i = 0;
    int j = 0;

    for(row = 0; row < lotto.length; row++) { //행이 0부터 5보다 작은 수까지 행이 1씩 증가 (상위for문)
        for(i = 0; i < lotto[row].length; i++) { //i가 0부터 행의 열 수 보다 작은 수까지 i가 1씩 증가(0,0),(0,1)....(5,6)
            lotto[row][i] = (int)(Math.random()*45)+1; //난수 생성 1~45

            for(j = 0; j < i; j++) { //j가 i보다 작을 때, 0부터 j가 1씩 증가함.
                if(lotto[row][j] == lotto[row][i]) { // 두 배열이 같을 때
                    i--; //i의 배열의 칸에서 j의 수와 중복되면 중복된 값은 제거 하고 for로 돌아감
                    break; // 수행이 끝나면 탈출
                }

            }
        }
        //선택정렬로 오름차순으로 정리하는 과정
        for(i = 0; i < lotto[row].length - 1; i++) {
            for(j =i + 1; j < lotto[row].length; j++) {
                if(lotto[row][i] > lotto[row][j]) {
                    int tmp = lotto[row][j];
                    lotto[row][j] = lotto[row][i];
                    lotto[row][i] = tmp;
                }
            }
        }
    }
    System.out.println("번호");
    for(row = 0; row < lotto.length; row++) { //행이 0부터 5보다 작은 수까지 행이 1씩 증가 (상위for문)
        for(i = 0; i < lotto[row].length; i++) {//i가 0부터 행의 열 수 보다 작은 수까지 i가 1씩 증가(0,0),(0,1)....(5,6)
            System.out.print(lotto[row][i] + " "); //최종 출력

        }
        System.out.println(); //개행.
    }
}

}


