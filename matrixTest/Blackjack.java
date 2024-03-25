package matrixTest;

import java.util.*;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arry = new int[sc.nextInt()];
        int answer = sc.nextInt();
        int sum =0;
        int listsum;
        Map<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<arry.length;i++){
            arry[i]=sc.nextInt();
        }

        for (int i =0;i<arry.length;i++){
            for (int j=i+1;j<arry.length;j++){
                for (int k=j+1;k< arry.length;k++){
                    sum = arry[i]+arry[j]+arry[k];
                    if (sum==answer){
                        listsum= 0;
                        map.put(listsum,sum);
                        list.add(listsum);
                        break;
                    }else if (sum>answer){
                    }else {listsum= answer-sum;
                        list.add(listsum);
                        map.put(listsum,sum);
                    }

                }
            }
        }
        Collections.sort(list);
        System.out.println(map.get(list.get(0)));
    }
}
