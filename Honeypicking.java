import java.util.Scanner;

public class Honeypicking {
    public static void main(String[] args) {
        // 굴 따기
        Scanner sc =new Scanner(System.in);
        int arry[] = new int[sc.nextInt()];
        for (int i=0;i<arry.length;i++){
         arry[i] =sc.nextInt();
        }

        for (int j=0;j<arry.length;j++){
             for (int i=0; i<arry.length;i++){
                 for (int k=0;k<arry.length;k++){
                      if (j>i && k>j){

                      }
                 }
            }
        }



    }
}
