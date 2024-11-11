//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // Конвертер валют

        int dollars;// сумма денег в американских долларах
        double roubles;// сумма денег в российских рублях
        final double ROUBLES_PER_DOLLAR = 97.91;// курс покупки
        Scanner in = new Scanner(System.in);

        // получение суммы денег в американских долларах.
        System.out.print("кол-во ваших долларов: ");
        dollars = in.nextInt();// ввод денег

        // конвертирование суммы денег в российские рубли.
        roubles = ROUBLES_PER_DOLLAR * dollars;

        // отображение суммы денег в российских рублях в пользу покупателя.
        System.out.println(Math.ceil(roubles) + " рублей");

        System.out.println();

        // Отображение текущего времени

        final int MILLISECONDS_PER_SECOND = 1000;
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int HOURS_PER_DAY = 24;

        long totalMilliseconds;

        long totalSeconds;
        long currentSecond ;

        long totalMinutes;
        long currentMinute;

        long totalHours;
        long currentHour;

        // общее кол-во миллисекунд, прошедших с 00:00:00 GMT 01/01/1970
        totalMilliseconds = System.currentTimeMillis();

        // общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;

        // текущее кол-во секунд
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;

        // общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;

        // текущее кол-во минут
        currentMinute = totalMinutes % MINUTES_PER_HOUR;

        // общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970
        totalHours = totalMinutes / MINUTES_PER_HOUR;

        // текущее кол-во часов
        currentHour = (totalHours + 3) % HOURS_PER_DAY;

        // Отобразить текущее время по Гринвичу
        System.out.println("Текущее время равно " + currentHour + ":" + currentMinute + ":" + currentSecond);

        System.out.println();

        // Банкомат

        int amount, numberOf5000Roubles, numberOf2000Roubles,
                numberOf1000Roubles, numberOf500Roubles, numberOf100Roubles,
                numberOf50Roubles;

        // сумму в рублях возьмём из переменной roubles(task 1)
        amount = (int)roubles;

        // количество 5 тыс. руб. купюр и обновление оставшийся суммы
        numberOf5000Roubles = amount / 5000;
        amount = amount % 5000;

        // количество 2 тыс. руб. купюр и обновление оставшийся суммы
        numberOf2000Roubles = amount / 2000;
        amount = amount % 2000;

        // количество 1 тыс. руб. купюр и обновление оставшийся суммы
        numberOf1000Roubles = amount / 1000;
        amount = amount % 1000;

        // количество 500 руб. купюр и обновление оставшийся суммы
        numberOf500Roubles = amount / 500;
        amount = amount % 500;

        // 100 руб. купюр и обновление оставшийся суммы
        numberOf100Roubles = amount / 100;
        amount = amount % 100;

        // количество 50 руб. купюр
        numberOf50Roubles = amount / 50;

        // количество купюр каждого достоинства
        System.out.println("На вашем счёте:");
        System.out.println(" - Пяти_тысячных купюр: " + numberOf5000Roubles + " шт.");
        System.out.println(" - Двух_тысячных купюр: " + numberOf2000Roubles + " шт.");
        System.out.println(" - Тысячных купюр: " + numberOf1000Roubles + " шт. ");
        System.out.println(" - Пяти_сот рублёвых купюр: " + numberOf500Roubles + " шт.");
        System.out.println(" - Ста рублёвых купюр: " + numberOf100Roubles + " шт.");
        System.out.println(" - Пяти_десяти рублёвых купюр: " + numberOf50Roubles + " шт.");

        System.out.println();

        // Вычисление платежей по кредиту

        final int MONTHS_PER_YEAR = 12; // 1 год содержит 12 месяцев

        double annualInterestRate; // ежегодная ставка в %
        double monthlyInterestRate; // ежемесячная ставка в %
        double loanAmount; // сумма кредита в рублях
        double monthlyPayment; // ежемесячный платеж в рублях
        double totalPayment; // стоимость кредита в рублях

        int numberOfYears; // срок кредита в годах

        // ежегодная ставка по кредиту в процентах
        annualInterestRate = 26.8;

        // срок кредита в годах
        numberOfYears = 6;

        // сумма кредита в рублях
        loanAmount = 4_000_000;
        System.out.println("сумма кредита равна: " + loanAmount);

        // ежемесячная ставка по кредиту в долях единицы
        monthlyInterestRate = annualInterestRate / 12 / 100;

        // ежемесячный платеж рублях
        monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * MONTHS_PER_YEAR));

        // стоимость кредита в рублях
        totalPayment = monthlyPayment * numberOfYears * MONTHS_PER_YEAR;

        System.out.println("ежемесячный платеж равен " +
                (int)(monthlyPayment * 100) / 100.0 + " руб."); // ежемесячный платеж в рублях
        System.out.println("стоимость кредита равна " +
                (int)(totalPayment * 100) / 100.0 + " руб."); // стоимость кредита в рублях
    }
}


