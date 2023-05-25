package HomeWork06;

// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
//      ноутбуки, отвечающие фильтру.
//      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
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