import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int totalSpends = 0;
        int[] spends = {250000, 340000, 230000, 670000, 780000};
        for (int i = 0; i < spends.length; i++) {
            totalSpends = spends[i] + totalSpends;
        }
        System.out.println("Сумма трат за месяц составила " + totalSpends + " рублей.");

        System.out.println("Задание 2");
        int[] spends2 = {360000, 120000, 670000, 870000, 640000};
        int maxSpends = -1;
        int minSpends = spends2[0];
        //Максимальное значение
        for (int i = 0; i < spends2.length; i++) {
            if (maxSpends < spends2[i]) {
                maxSpends = spends2[i];
            }
        }
        //Минимальное значение
        for (int i = 0; i < spends2.length; i++) {
            if (minSpends > spends2[i]) {
                minSpends = spends2[i];
            }
        }
        System.out.println("Макситмальная трата составила " + maxSpends + " рублей. Макситмальная трата составила " + minSpends + " рублей.");

        System.out.println("Задание 3");
        int totalSpends2 = 0;
        int[] spends3 = {560000, 700000, 140000, 730000, 200000};
        //Сумма
        for (int i = 0; i < spends3.length; i++) {
            totalSpends2 = spends3[i] + totalSpends2;
        }
        //Среднее арифметическое
        float a = (float) (totalSpends2 / spends3.length);
        System.out.println("Средняя сумма трат составляет " + a + " рублей.");

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}