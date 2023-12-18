package ru.wolfnord.lab10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();

        // Проверяем делимость на 2
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        // Проверяем делимость на другие нечетные числа
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // Если осталось число больше 2, то это также простой множитель
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> primeFactors = primeFactors(n);
        System.out.println("Простые множители числа " + n + ":");
        for (int factor : primeFactors) {
            System.out.println(factor);
        }
    }
}
