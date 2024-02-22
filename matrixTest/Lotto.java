package matrixTest;

public class Lotto {
    public static void main(String[] args) {
        //1.
        //서로 겹치지 않는 숫자 6개를 생성
        //2.
        //각 숫자는 1 ~ 45 범위 내의 숫자
        //3.
        //매번 실행 시 다른 숫자 출력
        //4.
        //오름차순 정렬
        //-> 랜덤수 : Math 사용
        int arry [] = new int[6];
        for (int i=0;i<arry.length;i++){
            boolean check = false;
            arry[i] = (int) (Math.random() * 45 + 1);
            for(int j=0;j< arry.length;j++) {
                

                if (arry[i] == arry[j] && i!=j) {
                    check = true;

                } else {}
            }


                if (check == false) {


                } else {
                    i--;

                }


        }
        System.out.println("---------로또 번호---------");
        int c;
        for (int i = 0; i < arry.length; i++) {
            for (int j = i; j < arry.length; j++) {
                if (arry[i] > arry[j]) {
                    c = arry[i];
                    arry[i] = arry[j];
                    arry[j] = c;
                }
            }
            System.out.print(" "+arry[i]+" ");

        }
        System.out.println();
        System.out.println("---------로또 번호---------");



    }
}
