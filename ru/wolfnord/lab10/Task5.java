// 5. Сумма цифр числа
//Дано натуральное число N. Вычислите сумму его цифр. При решении
//этой задачи нельзя использовать строки, списки, массивы (ну и циклы,
//разумеется). // 543 = 5 + 4 + 3 = 12

package ru.wolfnord.lab10;

import java.util.Scanner;

public class Task5 {
    public static int cntSum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + cntSum(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(cntSum(scanner.nextInt()));
    }
}
