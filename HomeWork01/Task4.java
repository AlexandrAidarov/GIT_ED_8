package HomeWork01;

import java.util.Scanner;
import java.time.LocalTime;

/* 4. В консоли запросить имя пользователя. В зависимости от текущего времени,
 вывести приветствие вида:
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59 */

public class Task4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = myScanner.nextLine();
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        if (hour > 4 & hour < 12){
            System.out.print("Доброе утро, " + name); 
        }
        if (hour > 11 & hour < 18){
            System.out.print("Добрый день, " + name); 
        }
        if (hour > 17 & hour < 23){
            System.out.print("Добрый вечер, " + name); 
        }
        if (hour == 23 || hour < 5){
            System.out.print("Доброй ночи, " + name); 
        }


    }
}
