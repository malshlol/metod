import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        printInfoYear(year);
    }

    private static void printInfoYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не високосный");
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2023;
        printInfoAboutVersion(clientOS, clientDeviceYear);
    }

    private static void printInfoAboutVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        StringBuilder result = new StringBuilder("Установите ");
        if (clientDeviceYear < currentYear) {
            result.append("облегченную версию для ");
        } else {
            result.append("версию для ");
        }
        if (clientOS == 0) {
            result.append("IOS");
        } else {
            result.append("Android");
        }
        System.out.println(result);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 54;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days ==-1){
            System.out.println("Доставка не возможна на расстояние " + deliveryDistance);
        } else {
            System.out.println("Время доставки "+days+"дней");
        }
    }
    private static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance<= 20){
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}




