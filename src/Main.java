import java.util.Scanner;

//Пользователь вводит с клавиатуры натуральное число большее 3,
// которое сохраняется в переменную n. Если пользователь ввёл не
// подходящее число, то программа должна просить пользователя повторить ввод.
// Создать массив из n случайных целых чисел из отрезка [0;n] и
// вывести его на экран. Создать второй массив только из чётных
// элементов первого массива, если они там есть, и вывести его на экран.
public class Main {

    public static void main(String[] args) {
        int m = 0; //n = 0;
        int j = 0;

        System.out.println("Введите натуральное число больше 3:");
        Scanner sc = new Scanner(System.in);
        M:
        for (int i = 0; i < 10; i++) {
            if (sc.hasNextInt()) {
                m = sc.nextInt();
            }

            if (m > 3) {
                break M;
            } else System.out.println("Число не верное,введите натуральное число больше 3: ");
        }
        int[] s = new int[m];
        int[] l = new int[m];


        for (int i = 0; i < s.length; i++) {

            s[i] = (int) (Math.random() * m);
            System.out.print(" " + s[i]);
            if (s[i] % 2 == 0) {
                l[i] = s[i];
               // ++j;
            }//else break;
        }
        System.out.println();
        for (; j < l.length; j++)
            if (l[j]!=0){System.out.print(" " + l[j]);}
            //System.out.print(" " + l[j]);
    }
}




















