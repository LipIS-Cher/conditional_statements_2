import java.util.Scanner;

public class Main {
    public static int zanied4(int deliveryDistance, int distance, int numberDays) {
        if (deliveryDistance > distance){
            return zanied4(deliveryDistance,(distance + 40),(numberDays + 1));
        }
        return numberDays;
    }

    public static void main(String[] args) {
        //zadanie 1
        byte versionOS = 0;
        if (versionOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (versionOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Попробуйте обновить страницу");
        }

        System.out.println(" ");
        //zadanie 2
        byte versionOS2 = 0;
        short yearVersion = 2000;
        if (versionOS2 == 0 && yearVersion >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (versionOS2 == 0 && yearVersion < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (versionOS2 == 1 && yearVersion >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (versionOS2 == 0 && yearVersion < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Попробуйте обновить страницу");
        }

        System.out.println(" ");
        //zadanie 3
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();

        if (year % 4 != 0){
            System.out.println("Год является обычным.");
        } else if (year % 100 == 0){
            if (year % 400 == 0){
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год является обычным.");
            }

        } else {
            System.out.println("Год является високосным");
        }

        System.out.println(" ");
        //zadanie 4
        int deliveryDistance = 150;
        int distance = 20;
        int numberDays = 1;
        System.out.println("Потребуется дней: " + zanied4(deliveryDistance, distance, numberDays));

        System.out.println(" ");
        //zadanie 5
        short monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит зиме.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит весне.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит лету.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит осени.");
                break;
            case 12:
                System.out.println("Этот месяц принадлежит зиме.");
                break;
            default:
                System.out.println("Ты головой ударился?");
        }
    }
}