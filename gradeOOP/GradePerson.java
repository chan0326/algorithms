package gradeOOP;

public class GradePerson {
    private String name;
    private double koreanScore;
    private double englishScore;
    private double mathScore;
    private  double avgScore;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void createKoreanScore(){
        this.koreanScore= Math.round((float) (Math.random()*100));
    }
    public double getKoreanScore(){
        return  this.koreanScore;
    }
    public  void createEnglishScore(){
        this.englishScore = Math.round((float) (Math.random()*100));
    }

    public double getEnglishScore() {
        return this.englishScore;
    }
    public  void  createMathScore(){
        this.mathScore =Math.round((float) (Math.random()*100));
    }
    public  double getMathScore(){
        return this.mathScore;
    }
    public void createAvgScore(){
        this.avgScore=(mathScore+englishScore+koreanScore)/3;
    }
    public  double getAvgScore(){
        return this.avgScore;
    }
}
