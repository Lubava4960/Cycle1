import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Задание 1.
        System.out.println("Задание 1 ");
        int contributionM = 15_000;
        int totalP = 0;
        int k = 0;
        for (; totalP < 2_459_000; k++) {
            totalP = totalP + totalP / 100;
            totalP = totalP + contributionM;
            System.out.println("месяцев " + k + " сумма накоплений " + totalP + "рублей ");

        }


        //Задание 2.
        System.out.println("Задание 2.");
        int n = 1;
        while (n <= 1) {
            n = n + 1;
            for (int j = 1; j < 11; j++) {
                System.out.print(j + " ");
            }
            System.out.print('\n');

        }
        for (int v = 1; v <= 1; v++) {
            for (int j = 10; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.print('\n');
        }
        //Задание 3.
        System.out.println("Задание 3.");
        int y = 12_000_000;
        int p = 1000;
        int yWas = 17;
        int yDeath = 8;
        for (int i = 1; i <= 10; i++) {
            int yP = 0;
            yP = ((y / p) * (17 - 8));
            y = y + yP;
            System.out.println("Численность населения в " + i + " год составляет " + y + " человек.");
        }
        //Домашнее задание 2. Задание 1,1 и 1.2.
        System.out.println("Домашнее задание 2. Задание 1,1 и 1.2 ");
        int salary = 15000;
        double perc = 0.07;
        double total = 0;
        int i = 0;
        for (; total < 12_000_000; i = i + 6) {
            total = total + (salary * perc);
            System.out.println("месяцев " + i + " накоплений " + total);
        }
        //Задание 2. 3.
        System.out.println("Задание 2. 3. ");
        int salaryV = 15_000;
        double percV = 0.07;
        double percYea = percV * 12;
        double totalV = 0;
        double g = 0;
        for (g = g + 0.5; g < 9.5; g = +g + 0.5) {
            totalV = (totalV + salaryV) + (salaryV * percYea);
            System.out.println("через  " + g + " года, накоплений " + totalV);
        }
        //Задание 2.4.
        System.out.println("Задание 2.4");
        int f = 4;
        int dayt = 1;
        dayt = dayt + 7;
        for (; f < 31; f = f + 7) {
            System.out.println("Сегодня пятница " + f + " нужно готовить отчёт ");
        }
        //Задание 3.1.
        System.out.println(" Задание 3.1 ");
        int fF = 1817;
        int nF = 1;
        nF = fF + 78;
        for (; fF < 2122; fF = fF + 79) {
            System.out.println(fF);
        }
        //Задание 3.2.
        System.out.println(" Задание 3.2. ");
        int b = 1;
        int i1 = 1;
        i1 = i1 * 2;
        for (; b < 10; b++) {
            int d = 1;
            int c = 2;
            c = c * b;
            for (; d <= 1; d = d +2) {

                System.out.println(i1 + " * " + b + " = " + c);
            }


        }
    }
}