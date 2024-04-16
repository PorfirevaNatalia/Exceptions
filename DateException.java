package исключения.homework3;

public class DateException extends Exception{
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("Неверные данные: %s", i);
        System.out.println();
    }
}