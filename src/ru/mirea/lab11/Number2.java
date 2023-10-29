package ru.mirea.lab11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println("Текущее время:"+currentDate);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате dd.MM.yyyy HH:mm:ss: ");
        String userInput = scanner.nextLine();
        // Преобразуем строку пользователя в объект Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date userDate = null;
        try {
            userDate = dateFormat.parse(userInput);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты!");
            return;
        }

        if (userDate.before(currentDate)) {
            System.out.println("Введенная дата меньше текущей даты");
        } else if (userDate.after(currentDate)) {
            System.out.println("Введенная дата больше текущей даты");
        } else {
            System.out.println("Введенная дата совпадает с текущей датой");
        }
    }
}