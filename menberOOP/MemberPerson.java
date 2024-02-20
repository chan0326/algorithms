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
}
