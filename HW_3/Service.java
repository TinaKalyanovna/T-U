package HW_3;

public class Service {
     // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public boolean isEvenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Метод проверяет, попадает ли переданное число в интервал (25;100) и возвращает true или false
    public boolean isNumberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }
}
