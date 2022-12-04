public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        int client = 0;
        int clientDeviceYear = 2015;
        if ((client == 0) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if ((client == 0) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if ((client == 1) && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if ((client == 1) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задание 3");
        int year = 2012;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println(year + " високостный год");
        else
            System.out.println(year + " обычный год");

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка карты займет сутки");
        }
        if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Доставка карты займет двое суток");
        }
        if ((deliveryDistance >=60)&&(deliveryDistance<100)){
            System.out.println("Доставка карты займет трое суток");
        }
        if (deliveryDistance>100)
            System.out.println("доставка карты займет более четырех суток");


        System.out.println("Задание 5");
            int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}