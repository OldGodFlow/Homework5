public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte ClientOS = 1 ;
        if (ClientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (ClientOS == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке"); }
    }

    public static void task2() {
        System.out.println("Задача 2");
            byte ClientOS = 1 ;
            int clientDeviceYear=2010 ;
            int deviceYearCutOff = 2015 ;

            if (ClientOS == 0) {
                if (deviceYearCutOff > clientDeviceYear ) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке"); } else
                        System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (ClientOS == 1) {
                if (deviceYearCutOff > clientDeviceYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке"); } else
                        System.out.println("Установите версию приложения для Android по ссылке"); }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2023 ;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является високосным"); }
        else {
            System.out.println(year + " не является високосным");}
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95 ;
        int days20Km = 1;

        if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + (days20Km));}
            else if (deliveryDistance >20 && deliveryDistance <=60) {
                System.out.println("Потребуется дней: " + (days20Km+1));}
            else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + (days20Km+2));}
            else {
                System.out.println("Доставка не производится");}
        }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12 ;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует"); }
        }

    }