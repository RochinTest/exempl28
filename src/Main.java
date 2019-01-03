import java.util.Arrays;

//Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
// выведите массив на экран в строку. Определите какой элемент
// встречается в массиве чаще всего и выведите об этом сообщение на экран.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int[] s = new int[11];

        for (int i = 0; i < 11; i++) {
            s[i] = (int) (Math.random() * (-4) + 2);
            System.out.print(" " + s[i]);
            if (s[i] == -1) {
                a++;
            } else if (s[i] == 0) {
                b++;
            } else if (s[i] == 1) {
                c++;
            }
        }
        System.out.println();
        if (a != b && a != c && b != c) {
            if (a > b & a > c) {
                System.out.println("Чаще встречается -1 ");
            } else if (b > a & b > c) {
                System.out.println("Чаще встречается 0 ");
            } else if (c > a & c > b) {
                System.out.println("Чаще встречается 1 ");
            }
        }
    }


}






