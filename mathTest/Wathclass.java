package mathTest;

public class Wathclass {
    static int retrunname(){
        int randomNumber =(int)(Math.random()*100);
        System.out.printf("랜덤값: %d",randomNumber);
        return randomNumber;
    }

    public static void main(String[] args) {

        int age = retrunname();
        System.out.println("나이"+ age);


    }
}