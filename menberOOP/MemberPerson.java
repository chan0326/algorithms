package menberOOP;

public class MemberPerson {
    private String id;

    private String pw;

    private String pwAgain;

    private String name;

    private String personID;

    private String phoneNumber;

    private String adress;

    private String job;
    private double height;
    private double weight;










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

    //카우프 지수에서 사용하는 생성자
    public MemberPerson(double height,double weight){
        this.height =height;
        this.weight =weight;
    }


    // 회원가입에서 사용하는 생성자
    public MemberPerson(String id,String pw,String pwAgain,String name,
                        String personID ,String phoneNumber ,String adress,String job){
        this.id = id;
        this.pw=pw;
        this.pwAgain=pwAgain;
        this.name=name;
        this.personID=personID;
        this.phoneNumber=phoneNumber;
        this.adress=adress;
        this.job=job;

    }
    public void setId(String id){
        this.id = id;
    }

    public  String getId(){
        return this.id;
    }

    public  void setPw(String pw){
        this.pw=pw;
    }
    public String getPw(){
        return this.pw;
    }
    public void setPwAgain(String pwAgain){
        this.pwAgain=pwAgain;
    }
    public String getPwAgain(){
        return this.pwAgain;
    }
    public  void  setName(String name){
        this.name=name;
    }
    public  String getName(){
        return  this.name;
    }
    public void setPersonID(String personID){
        this.personID=personID;
    }
    public String getPersonID(){
        return this.personID;
    }
    public void setPhoneNumber(String phoneNumber ){
        this.phoneNumber=phoneNumber;
    }
    public  String getPhoneNumber(){
        return this.phoneNumber;
    }
    public  void setAdress(String adress){
        this.adress=adress;
    }
    public String getAdress(){
        return this.adress;
    }
    public void setJob(String job){
        this.job=job;
    }
    public String getJob(){
        return this.job;
    }

    @Override
    public String toString() {
        return "MemberPerson{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", pwAgain='" + pwAgain + '\'' +
                ", name='" + name + '\'' +
                ", personID='" + personID + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
