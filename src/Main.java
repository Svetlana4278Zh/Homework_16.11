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
        int year = 2003;
        if (year%4!=0){
            System.out.println(year+" год не является високосным");
        } else if (year%400==0){
            System.out.println(year+" год является високосным");
        } else if (year%100==0){
            System.out.println(year+" год не является високосным");
        } else {
            System.out.println(year+" год является високосным");
        }
    }
}