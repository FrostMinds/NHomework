import java.time.LocalDate;
import java.util.Arrays;

public class Homework_07 {
    public static void leapYear(int year) {
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            System.out.println(year + " Високосный год.");
        } else
            System.out.println(year + " Не високосный год.");
    }

    public static void version(int clientOC) {
        int currentYear = LocalDate.now().getYear();
        boolean isLite = currentYear < 2015;

        if (clientOC == 0) {
            if (isLite) {
                System.out.println("Установите lite-версию приложения для IOS по ссылке. ");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке. ");
            }
        } else if (clientOC == 1) {
            if (isLite) {
                System.out.println("Установите lite-версию приложения для Android по ссылке. ");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке. ");
            }
        } else {
            System.out.println("Данной OC не существует.");
        }
    }

    public static void delivery(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day++;
        }
        System.out.println("Потребуется дней : " + day);
    }
    public static void duplicate (String text) {
        char[] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println("Найден дубль по символу " + letter);
                return;
            }
            prevChar = letter;

        }
        System.out.println("Дублей не найденно");
    }

    public static void reverseArray (int[] arr) {
        Arrays.copyOf(arr, arr.length);
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int temp = arr [head];
            arr [head++] = arr[tail];
            arr [tail--] = temp;
        }
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        leapYear(2021);
    }

    public static void task2() {
        version(3);
    }

    public static void task3() {
        delivery(100);
    }

    public static void task4() {
        duplicate("abc");

    }

    public static void task5() {
        int [] data = {3, 1, 3, 1, 2};
        reverseArray(data);
        System.out.println("Reverse array: " + Arrays.toString(data));

    }
}