public class Homework_03 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            if (i == 10) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
            i++;

        }
        for (int num = 10; num > 0; num--) {
            if (num == 1) {
                System.out.println(num);
                break;

            }
            System.out.print(num + " ");
        }

        int friday = 1;
        for (int currentFriday = friday; currentFriday <= 31; friday = currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчёт.");
        }

        int year = 2021;
        int begin = year - 200;
        int end = year + 100;

        for (int comet = begin; comet < end; comet++) {
            if (comet % 79 == 0) {
                System.out.println(comet);
            }
        }
    }
}