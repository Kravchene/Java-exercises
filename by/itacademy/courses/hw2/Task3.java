package by.itacademy.courses;

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        int time = 650000;
        int week = time / 604800;
        int day = time % '\uebf0' / 86400;
        int hour = time % '\uebf0' % 86400 / 3600;
        int minutes = time % '\uebf0' % 86400 % 3600 / 60;
        int seconds = time % '\uebf0' % 86400 % 3600 % 60;
        System.out.println("недель: " + week + " дней: " + day + " часов: " + hour + " минут: " + minutes + " секунд: " + seconds);
    }
}
