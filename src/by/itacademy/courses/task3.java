package src.by.itacademy.courses;

public class task3 {
    public static void main(String[] args) {

        int time = 650000;
        int week = time/604800;
        int day = (time%60400)/86400;
        int hour = ((time%60400)%86400)/3600;
        int minutes = (((time%60400)%86400)%3600)/60;
        int seconds =(((time%60400)%86400)%3600)%60;

        System.out.println("недель "+week+" дней "+day+" часов "+hour+" минут "+minutes+" секунд "+seconds);

    }
}