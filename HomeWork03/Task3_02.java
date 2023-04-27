package HomeWork03;

import java.util.*;

/* 2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> 
так, что на 0й позиции каждого внутреннего списка содержится название жанра, 
а на остальных позициях - названия книг. 
Напишите метод для заполнения данной структуры(можно через консоль).
Пример:
"Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
"Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
"Детектив", "Десять негритят".
"Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал". */


public class Task3_02 {
    public static void main(String[] args) {
        /*List <String> SomeList = new ArrayList<>();
        String [] valueList = {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"};
        for (int i = 0; i < valueList.length; i++) {
            SomeList.add(valueList[i]);
        }
        System.out.println(SomeList);*/
        /*
        List<List<String>> list = Arrays.asList(
            Arrays.asList("A", "B", "C"),
            Arrays.asList("B", "D"),
            Arrays.asList("E", "F")
        );

        String[][] arr = list.stream()
            .map(l -> l.stream().toArray(String[]::new))
            .toArray(String[][]::new);

        System.out.println(Arrays.deepToString(arr));*/
        Scanner myScanner = new Scanner(System.in);
        //System.out.println("Введите жанр : ");
        //String typeOfFilm = myScanner.nextLine();
        //System.out.println("Введите название фильма : ");
        //String film = myScanner.nextLine();
        
        String [][] arr = new String[6][6];
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print("\n");
            
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0) {
                    System.out.println("Введите жанр : ");
                    String typeOfFilm = myScanner.nextLine();
                    
                }
                System.out.println("Введите название фильма : ");
                String film = myScanner.nextLine();
                if ( film == null) {
                    for (int k = 0; k < arr.length; k++) {
                        for (int l = 0; l < arr[k].length; l++) {
                            System.out.printf(arr[k][l] + "\t");
                        }
                    }
                    j = arr[i].length;
                    i = arr.length;
                }
                arr[i][j] = film;


                    //System.out.print(arr[i][j] + "\t");
            }
        }




    }
}
