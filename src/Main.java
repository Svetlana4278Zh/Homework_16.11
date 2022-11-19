public class Main {
    public static void main(String[] args) {
        //Задача 1, 2
        System.out.println("Задача 1, 2");
        int clientOS = 0; //0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        if (clientOS==0&&clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1&&clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 3
        System.out.println("\nЗадача 3");
        int year = 2000;
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+" год является високосным");
        } else {
            System.out.println(year+" год не является високосным");
        }
        //Задача 4
        System.out.println("\nЗадача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1+(20+deliveryDistance)/40;
        System.out.println("Потребуется дней: " +deliveryTime);
        //Задача 5
        System.out.println("\nЗадача 5");
        int monthNumber = 12;
        switch (monthNumber){
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
                System.out.println("Такого месяца нет!");
        }
    }
}