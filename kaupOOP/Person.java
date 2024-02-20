package kaupOOP;

public class Person {
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void creatHeight (){
        this.height = Math.round((float) (Math.random()*50)+150.2);;

    }

    public  double getHeight ( ){
        return  this.height;
    }
    public void creatWeight (){
        this.weight = Math.round((float) (Math.random()*69)+30.2);;


    }
    public  double getWeight (){
        return  this.weight;
    }

    public  double getBmi (){
        return  this.bmi;
    }

    public  String getBodyMass (){
        return  this.bodyMass;
    }

    public void creatBmi(){
        this.bmi =(weight/(height/100)*(height/100));

    }
    public void creatBodymass(){
        String bodyMass = "";

        if (bmi < 10 ){
            bodyMass = "저체중";

        } else if ( bmi <23.9  ) {
            bodyMass= "정상";


        } else if ( bmi <29.9) {
            bodyMass= "과체중";

        } else if ( bmi <36.9) {
            bodyMass= "경도비만";

        } else if ( bmi <38.9) {
            bodyMass= "중도비만";

        }else   {
            bodyMass= "고도비만";

            this.bodyMass=bodyMass;
        }




    }

}
