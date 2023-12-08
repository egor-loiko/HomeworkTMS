package homeWork6.task1;

/*
1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную  карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.

Тестовый сценарий для проверки:
1. Положите деньги на первые две карточки и снимите с третьей.
2. Выведите на экран текущее состояние всех трех карточек.
 */

public class CreditCardDemo {
    public static void main(String[] args){

        CreditCard creditCard1 = new CreditCard(12345678, 234.45f);
        CreditCard creditCard2 = new CreditCard(87654321, 12.99f);
        CreditCard creditCard3 = new CreditCard(43218765, 1023.91f);

        creditCard1.addAmountToCreditCard(56.16f);
        creditCard2.addAmountToCreditCard(0.02f);
        creditCard3.removeAmountFromCard(23f);

        creditCard1.getCreditCardInfo();
        creditCard2.getCreditCardInfo();
        creditCard3.getCreditCardInfo();
    }
}
