package HomeWork06;

/* Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 фильтрации и выведет ноутбуки, отвечающие фильтру. 
 Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры
 фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task6_1 {
    public static void main(String[] args) {

        Set<NoteBoocks> set = new HashSet<>();
        set.add(new NoteBoocks("Notebook 1", 8, "Windows10", 80000, "HP"));
        set.add(new NoteBoocks("Notebook 2", 16, "Windows10", 85000, "Asus"));
        set.add(new NoteBoocks("Notebook 3", 32, "linux", 85000, "Lenovo"));
        set.add(new NoteBoocks("Notebook 4", 64, "linux", 90000, "Lenovo"));

        RequestsNote operation = new RequestsNote(set);
        operation.start();

    }
}