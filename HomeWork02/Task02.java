package HomeWork02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* 2.Напишите метод, который определит тип (расширение) файлов из текущей папки
 и выведет в консоль результат вида:
    1 Расширение файла: txt
    2 Расширение файла: pdf
 
 private static String getFileExtension(String mystr) {
    int index = mystr.indexOf('.');
    return index == -1? null : mystr.substring(index);
}
 
    */


public class Task02 {
    public static void main(String[] args) {

        ex1("C:\\Users\\ROMANOV\\Desktop\\GIT_ED_8\\HomeWork02");



    }
    private static void ex1(String pathDir) {
        File file = new File(pathDir);
        // file.list();
        if(!(file.exists()  || file.isDirectory())){
            return;
        }
        String [] dirListNames = file.list();
        StringBuilder sb = new StringBuilder();
        for (String fileName : dirListNames){
            sb.append(fileName).append(System.lineSeparator());

        }
        System.out.println(sb);

        PrintWriter pw = new PrintWriter('C:\Users\ROMANOV\Desktop\GIT_ED_8\HomeWork02\Test.txt');
        pw.println(sb);
    }


}
