//Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        Scanner iscanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = iscanner.nextInt();
        System.out.println("Треугольное число: " + giveMeNumber(i));
        iscanner.close();
    }


    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}