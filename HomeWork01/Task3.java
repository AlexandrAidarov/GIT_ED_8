package HomeWork01;
import java.util.random.RandomGenerator;
import java.util.Random;



/* 2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами ; */

public class Task3 {
    public static void main(String[] args) {

                
        int[][] arr = new int[6][6];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "\t");
            }
        }
        /* System.out.println("max: " + max);
        System.out.println("min: " + min); */
    }
    
}