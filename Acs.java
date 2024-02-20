public class Acs {
    public static void main(String[] args) {


        // 오름차순


        int [] arry1 = {20,34,54,23,100,100,90,5,10};

        int c ;
        for (int i = 0; i < 9; i++) {
            for (int j = i; j < 9; j++) {
                if (arry1[i] > arry1[j]) {
                    c = arry1[i];
                    arry1[i] = arry1[j];
                    arry1[j] = c;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(arry1[i]);
        }
    }
}
