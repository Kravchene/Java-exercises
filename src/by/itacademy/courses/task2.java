package src.by.itacademy.courses;
public class task2 {
    public static void main(String[] args) {
       int number1 = 40;
       int number2 = 20;

       number(number1,number2);
    }
    static void number(int number1,int number2){
        int result = (number1+number2)+(number1*number2);
        System.out.println(result);
    }

}
