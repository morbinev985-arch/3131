import javax.swing.*;
import java.time.LocalDate;
import java.util.Dictionary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        checkIsLeapYear(2022);
        checkIsLeapYear(2025);

        System.out.println("Задание 2");

        defineAppVersion( 0, 2022);
        defineAppVersion( 1, 2026);

        System.out.println("Задание 3");
        printCardDelivaryDistance(80);
        printCardDelivaryDistance(200);
    }

    public static void checkIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "високосный гож");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void defineAppVersion(int mobileOs, int mobileYear) {
        int currentYear = LocalDate.now().getYear();

        String mobileOsName = switch (mobileOs) {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> "неизвестная ОС";
        };

        if (mobileYear != currentYear) {
            System.out.println("устоновите облегченную версию для " + mobileOsName + "по ссылке");
        } else {
            System.out.println("устоновите обычеую версию для " + mobileOsName + "по ссылке");
        }
    }
    public static int caleCardDeliveryDistance(int distance) {
        if (distance <= 20) {
            return 1;
        }else if (distance <=60) {
            return 2;
        } else if (distance <=100) {
            return 3;
        } else {
            return  -1;
        }
    }

    public  static  void printCardDelivaryDistance(int distance) {
        int day = caleCardDeliveryDistance(distance);

        if (day > 0) {
            System.out.println("потребуется дней: " + day);
        }else {
            System.out.println("Доставка не осущестляется");
            System.out.println("end");
        }
    }
}