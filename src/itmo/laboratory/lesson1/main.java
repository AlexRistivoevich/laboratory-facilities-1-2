package itmo.laboratory.lesson1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        texts(); // 1 - Выведите строки в следующем порядке
        System.out.println(ravno1(46, 10, 3)); //2- Посчитайте результат выражения
        System.out.println(ravno2(29, 4, -15)); //2- Посчитайте результат выражения
        System.out.println(reshenije1()); // 3
        System.out.println(reshenije2(3.6, 4.1, 5.9)); // 4
        reshenije3(); // 5
        reshenije4();//6
    }

    public static void texts() {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");
    }

    public static int ravno1(int a, int b, int c) {
        int sum;
        sum = (a + b) * (b / c);
        return sum;
    }

    public static int ravno2(int a, int b, int c) {
        int sum;
        sum = (a) * (b) * (c);
        return sum;
    }

    public static int reshenije1() {
        int number = 10500;
        int result = (number / 10) / 10;
        return result;
    }

    public static double reshenije2(double a, double b, double c) {
        double result = a + b + c;
        return result;
    }

    public static void reshenije3() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void reshenije4() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона”");
        } else {
            System.out.println("Четное");
        }
    }
}