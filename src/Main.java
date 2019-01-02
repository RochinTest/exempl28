import java.util.Arrays;

//). Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
// Напоминаем, что первый и второй члены последовательности равны единицам, а
// каждый следующий – сумме двух предыдущих.
public class Main {

    public static void main(String[] args) {
        int a = 0;
        int[] s = new int[22];

        for (int i = 2; i < 22; i++) {
            s[0] = 0;
            s[1] = 1;
            s[i] = s[i - 1] + s[i - 2];


            System.out.print(" " + s[i - 2]);

        }
        System.out.println();

    }
}


