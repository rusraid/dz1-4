package ru.skypro;

public class Main {

    public static void main(String[] args) {

//        task1();
//        task2();
        task3();
    }

    public static void task1() {
//for (int i= 0; i <= 10; i++) {
//    System.out.println("Итерация цикла " + i);
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (int a = 10; a > 0; a--) {

            System.out.print(" " + a);
        }
    }

    public static void task2() {

        int i = 5; // первая пятница
        for (; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + " число. Необходимо подготовить отчет");
        }

    }


    public static void task3() {

        int currentYear = 2021;
        int yearsStart = currentYear - 200;
        int yearsEnd = currentYear + 100;
        for (int i = yearsStart; i < yearsEnd; i++)
            if (i % 79 == 0) {
                System.out.println(i);
            }

    }
}
