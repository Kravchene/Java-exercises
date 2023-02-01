package src.by.itacademy.courses;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number= in.nextInt();

        String even = number % 2==0 ? "четное" : "нечетное";
        int remainderOrZero = number % 2 ==0 ? 0:number%2 ;
        System.out.println(even+"\n"+remainderOrZero);
    }
}
