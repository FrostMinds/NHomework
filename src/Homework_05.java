import java.util.Arrays;

public class Homework_05 {

    public static void main(String[] args) {
        int[] arr =  generateRandomArray();
        int sum = 0;
        for (int element : arr)
            sum += element;
        System.out.println("Сумма трат за месяц составила - " + sum + " рублей.");




       int min = arr[0];
       int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;

            }

        }
        System.out.println("Минимальная трата за день " + min + ".");
        System.out.println("Максимальная трата за день " + max + ".");



        int sum1 = 0;
        for (int value : arr)
            sum1 += value;
        System.out.println(sum1 / (float) arr.length);



        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


        }


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}