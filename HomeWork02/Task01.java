package HomeWork02;

import java.util.Set;



/* 1. Дана строка sql-запроса "select * from students where ".
 Сформируйте часть WHERE этого запроса, используя StringBuilder.
  Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Пример 1:
Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
 */

public class Task01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] set = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
        String value1 = "'";
        char[] value = value1.toCharArray();

        for (int i = 0; i < set.length; i++) {
            char[] index = set[i].toCharArray();
            for (int j = 0; j < index.length; j++ ){
            // for (char j : index){    
                if (index[j] == value[0]){
                    sb.append(" = '");
                }
                if (j == index.length - 1) {
                    sb.append(index[j] + "'");
                }
                else{
                    sb.append(index[j]);
                }
            }
            if (i != set.length - 1){
                sb.append(" and ");
            }
            else{
                sb.append(";");
            }
        }
        System.out.println(sb);

    }






}