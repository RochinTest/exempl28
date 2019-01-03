//import java.util.Scanner;

// Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10]
// таким образом, чтобы отрицательных и положительных элементов там было поровну
// и не было нулей. При этом порядок следования элементов должен быть случаен
// (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных,
// а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
// Вывести полученный массив на экран.
public class Main {

    public static void main(String[] args) {
        int m = 0, n = 0;
        int j = 0;

        // System.out.println("Введите чётное положительное число:");
        // Scanner sc = new Scanner(System.in);
        // M:
        //for (int i = 0; i < 10; i++) {
        //  if (sc.hasNextInt()) {
        // m = sc.nextInt();
        //  }

        //if (m > 0 && m % 2 == 0) {
        // break M;
        // } else System.out.println("Число не верное,Введите чётное положительное число ");
        // }
        int[] s = new int[10];
        int i = 0;

        while (i < 10) {

            s[i] = (int) (Math.random() * 22 - 11);
            if (s[i] == 0) {
                continue;
            } else if (s[i] > 0) {
                m++;
            } else if (s[i] < 0) {
                n++;
            }

            System.out.print(" " + s[i]);
            i++;
        }
        System.out.println();
        System.out.println(m + " " + n);
        m = 0;n=0;
        while (j < 10) {
            if (m > n && s[j] > 0) {
                s[j] *= -1;
            }else if (m<n && s[j]<0){s[j]*=-1;}
            if (s[j] > 0) {
                m++;
            } else if (s[j] < 0) {
                n++;
            }
            System.out.print(" " + s[j]);
            j++;
        }System.out.println();
        System.out.println(m + " " + n);
    }

}













