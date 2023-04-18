package HomeWork01;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.util.Random;

/* 2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ; */

public class Task2 {
    public static void main(String[] args) {

        int max = 0;
        
        int[] arr = new int[10];
        int min = arr[0];
        for (int i : arr) {
            Random random = new Random();
            i = random.nextInt();
            System.out.print(i + " ");
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
    
}
