import java.time.LocalDate;

public class Homework11 {

    static int hw = 11;

    public static void main(String[] args) {
        printHwTitle();
        task1();
        task2();
        task3();
        printCompletionMessages();

    }

    public static void printHwTitle() {
        System.out.println("ДОМАШНЕЕ ЗАДАНИЕ " + hw);
        System.out.println(" ");
    }

    public static boolean checkYearIntercalary(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        System.out.print("Год " + year + " ");
        if (checkYearIntercalary(year)) {
            System.out.println("високосный");
        } else System.out.println("невисокосный");
        System.out.println("");
    }

    public static void typePrompt(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String prompt = "...";
        boolean clientDataOK = true;
        clientDataOK = (clientOS == 0 || clientOS == 1) && (clientDeviceYear <= currentYear);
        if (clientDataOK) {
            if (clientDeviceYear == currentYear) {
                prompt = "Загрузите версию приложения для операционной системы ";
            } else {
                prompt = "Загрузите облегченную версию приложения для операционной системы ";
            }
            switch (clientOS) {
                case 0:
                    prompt = prompt + "iOS";
                    break;
                case 1:
                    prompt = prompt + "Android";
                    break;
            }
            System.out.println(prompt);
        } else {
            System.out.println("Уточните, пожалуйста, год выпуска Вашего устройства");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0,
                clientDeviceYear = 2023;
        typePrompt(clientOS, clientDeviceYear);
        System.out.println("");
    }

    public static int calculateDeliveryTime(int distance) {
        int deliveryTime = -1;
        int range1 = 20, range2 = 60, range3 = getMaxDistance();
        if (distance <= range1 && distance >= 0) {
            deliveryTime = 1;
        }
        if (distance > range1 && distance <= range2) {
            deliveryTime = 2;
        }
        if (distance > range2 && distance <= range3) {
            deliveryTime = 3;
        }
        if (distance > getMaxDistance()) {deliveryTime = -2;}
        return deliveryTime;
    }

    public static int getMaxDistance() {
        int maxDistance = 100;
        return maxDistance;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int clientDistance = 95;
        if (clientDistance < 0) {
            System.out.println("Уточните, пожалуйста, адрес доставки");
        }
        if (clientDistance > getMaxDistance()) {
            System.out.println("На расстояние более " + getMaxDistance() + "км доставка не выполняется");
        }
        if (clientDistance <= getMaxDistance() && clientDistance >= 0) {
            System.out.println("Доставка на расстояние " + clientDistance + "км выполняется в течение " +
                    calculateDeliveryTime(clientDistance) + " суток");
        }
        System.out.println("");
    }

    public static void printCompletionMessages() {
        String hwStatus = " выполнено ))";
        System.out.println("Домашнее задание " + hw + hwStatus);
        System.out.println(" ");
    }
}