public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("\nЗадание 1\n");

        byte clientOS = 0;     //(0 — iOS, 1 — Android).

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Для данного устройства нет приложения");
        }
    }


    public static void task2() {
        System.out.println("\nЗадание 2\n");

        int clientDeviceYear = 2015;
        byte clientOS = 0;     //(0 — iOS, 1 — Android).

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }


        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    }


    public static void task3() {
        System.out.println("\nЗадание 3\n");

        int year = 2021;

        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }


    public static void task4() {
        System.out.println("\nЗадание 4\n");

        byte deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день для доставки.");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется два дня для доставки.");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется три дня для доставки.");
        } else {
            System.out.println("Доставки в этот район нет.");
        }

    }


    public static void task5() {
        System.out.println("\nЗадание 5\n");

        byte monthNumber = 53;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц - это месяц зимы.");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц - это месяц весны.");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц - это месяц лета.");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц - это месяц осени.");
                break;

            default:
                System.out.println("Вы ошиблись в месяце, месяца " + monthNumber + " не существует.");
        }
    }
}