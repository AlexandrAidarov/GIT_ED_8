package HomeWork01;

import java.util.Scanner;

/* 1. Написать метод, принимающий на вход два аргумента: 
len и initialValue, и возвращающий одномерный массив типа int длиной len, 
каждая ячейка которого равна initialValue; */
public class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int len = myScanner.nextInt();
        System.out.println("Значение элемента массива: ");
        int initialValue = myScanner.nextInt();
        int[] arr = new int[len];
        for (int i : arr) {
            i = initialValue;
            System.out.print(i + " ");
        }


    }
}