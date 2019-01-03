import java.util.Scanner;

//). Пользователь должен указать с клавиатуры чётное положительное число,
// а программа должна создать массив указанного размера из случайных целых
// чисел из [-5;5] и вывести его на экран в строку. После этого программа
// должна определить и сообщить пользователю о том, сумма модулей какой
// половины массива больше: левой или правой, либо сообщить, что эти суммы
// модулей равны. Если пользователь введёт неподходящее число, то программа
// должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
public class Main {

    public static void main(String[] args) {
        int m = 0, n, l;

        System.out.println("Введите чётное положительное число:");
        Scanner sc = new Scanner(System.in);
        M:
        for (int i = 0; i < 10; i++) {
            if (sc.hasNextInt()) {
                m = sc.nextInt();
            }

            if (m > 0 && m % 2 == 0) {
                break M;
            } else System.out.println("Число не верное,Введите чётное положительное число ");
        }
        int[] s = new int[m];
        n = m / 2;
        int sumleft = 0;
        int sumraid = 0;
        for (int i = 0; i < s.length; i++) {
            s[i] = (int) (Math.random() * 12 - 6);
            System.out.print(" " + s[i]);
            if (n <= i) {
                sumleft = sumleft + s[i];
            } else {
                sumraid = sumraid + s[i];
            }
        }System.out.println();
        if (sumleft < sumraid) {
            System.out.println("левая сумма больше");
        } else if (sumleft > sumraid) {
            System.out.println("правая сумма больше");
        } else if (sumleft == sumraid) {
            System.out.println(" суммы равны");
        }
    }
}











