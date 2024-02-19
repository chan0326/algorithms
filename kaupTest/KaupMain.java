package kaupTest;

public class KaupMain {
    public static void main(String[] args) {
        // 카우프지수 구하는 프로그램을 작성해 주세요
        // 키 : 150~200 몸무게 : 30~99
        double height = Math.round((float) (Math.random()*50)+150.2);
        double weight = Math.round((float) (Math.random()*69)+30.2);
        System.out.println(weight);
        System.out.println(height);
        double heightMeter = (height/100)*(height/100);
        double bmi =(weight/ heightMeter);
        System.out.println(bmi);

        if (bmi < 10 ){
            System.out.printf("BMI지수는 %f 이고 저체중입니다",bmi);
        } else if ( bmi <23.9  ) {
            System.out.printf("BMI지수는 %f 이고 정상입니다",bmi);

        } else if ( bmi <29.9) {
            System.out.printf("BMI지수는 %f 이고 과체중입니다",bmi);
        } else if ( bmi <36.9) {
            System.out.printf("BMI지수는 %f 이고 경도비만입니다",bmi);
        } else if ( bmi <38.9) {
            System.out.printf("BMI지수는 %f 이고 중도비만입니다",bmi);
        }else   {
            System.out.printf("BMI지수는 %f 이고 고도비만입니다",bmi);
        }


    }
}
