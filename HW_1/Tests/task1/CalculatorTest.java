package HW_1.Tests.task1;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

        //        проверяем утверждения, связанные с правильностью вычисления цены со скидкой
                assertThat(Calculator.calculateDiscount(9000, 70)).isEqualTo(2700);
                assertThat(Calculator.calculateDiscount(2200, 7)).isEqualTo(2046);
                assertThat(Calculator.calculateDiscount(100, 10)).isEqualTo(90);
                assertThat(Calculator.calculateDiscount(33, 0)).isEqualTo(33);
        //        проверяем утверждения, связанные с выбрасыванием ошибки
                // проверяем верхний предел скидки
                assertThatThrownBy(() -> Calculator.calculateDiscount(330, 71))
                        .isInstanceOf(ArithmeticException.class).hasMessage("Скидка в диапазоне от 0 до 70%");
                // проверяем что скидка не может быть отрицательной
                assertThatThrownBy(() -> Calculator.calculateDiscount(1000, -50))
                        .isInstanceOf(ArithmeticException.class).hasMessage("Скидка в диапазоне от 0 до 70%");
                // проверяем что сумма покупки не может быть отрицательной
                assertThatThrownBy(() -> Calculator.calculateDiscount(-1000, 20))
                        .isInstanceOf(ArithmeticException.class).hasMessage("Сумма покупки не бывает отрицательной");
        
            }
        
}
