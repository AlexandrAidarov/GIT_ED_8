package HomeWork03;

import java.util.Set;
import java.util.ArrayList;
//import java.util.*;.Array;
import java.util.*;

/* 1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
 Пройти по списку, найти и удалить целые числа.
Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"} */
public class Task3_01 {
    public static void main(String[] args) {
        List <String> SomeList = new ArrayList<>();
        String [] valueList = {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"};
        for (int i = 0; i < valueList.length; i++) {
            SomeList.add(valueList[i]);
        }
        System.out.println(SomeList);
       
    
        ArrayList<Integer> num = new ArrayList<Integer>(); 
        for (int i = valueList.length - 1; i >= 0; i--) {
            if (Character.isDigit(valueList[i].charAt(0))) {
                num.add(i);
            }
        }
        System.out.println(num);
        
        for (int i : num) {
            SomeList.remove(i);
        }
        System.out.println(SomeList);
        
    }
    /*public static boolean isNumber(String str) {
        //for (int i = 0; i < str.length(); i++) {
        if (!Character.isDigit(str.charAt(0))) {
        return false;
        }
        return true;
    }*/


}
