package HW_1.task1;

public class Calculatorr {
    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        double discountedAmount;

        if (purchaseAmount >= 0) {
            if (discountAmount >= 0 && discountAmount <= 70) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException("Скидка должна быть в диапазоне от 0 до 70%");
            }
        } else {
            throw new ArithmeticException("Сумма покупки не бывает отрицательной");
        }
        return discountedAmount;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }
}
