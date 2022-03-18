package ru.skypro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// Задача 6 ============================================================
        int[] arr = {5, 4, 3, 2, 1};
        int f = arr.length;
        int[] arrNew = new int[f];
        System.out.println(Arrays.toString(arr));
        f--;
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[f];
            f--;
        }
        System.out.println(Arrays.toString(arrNew));
        System.out.println("======     Конец задачи 6   ========");

// Задача 7 ============================================================
        // используем массив arr из Задачи 6
        System.out.println(Arrays.toString(arr));
        f = arr.length - 1;
        int tempElement;
        for (int i = 0; i <= f; i++) {
            tempElement = arr[f];
            arr[f] = arr[i];
            arr[i] = tempElement;
            f--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("======     Конец задачи 7   ========");
// Задача 8 ============================================================
        int[] arrUnsorted = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(arrUnsorted));
        Arrays.sort(arrUnsorted);
        System.out.println(Arrays.toString(arrUnsorted));
        boolean count = false;
        for (int i = 0; i < arrUnsorted.length; i++) {
            if (!count) {
                for (int j = 0; j < arr.length; j++) {
                    if (arrUnsorted[i] + arrUnsorted[j] == -2 && i != j) {
                        System.out.println("Числа массива, сумма которых равна -2, это: " + arrUnsorted[i] + " и " + arrUnsorted[j]);
                        count = true;
                    }
                }
            } else {
                break;
            }

        }
        System.out.println("======     Конец задачи 8   ========");
// Задача 9 ============================================================
        for (int i = 0; i < arrUnsorted.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arrUnsorted[i] + arrUnsorted[j] == -2 && i != j) {
                    System.out.println("Числа массива, сумма которых равна -2, это: " + arrUnsorted[i] + " и " + arrUnsorted[j]);
                }
            }

        }


    }
}