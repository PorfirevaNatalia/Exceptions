package исключения.homework3;

import java.util.Scanner;
public class InputData {
    public String[] enterData() {
        Scanner console = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения в формате dd.mm.yyyy, номер телефона в десятизначном формате, пол - f/m ) : ");
            String data = console.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные. Повторите ввод, пожалуйста!");
            } else System.out.println("Вы ввели лишние данные. Повторите ввод, пожалуйста!");
        }

    }
}
