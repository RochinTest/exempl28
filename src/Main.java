import java.util.Arrays;

//Создайте два массива из 10 целых случайных чисел из отрезка [1;9]
// и третий массив из 10 действительных чисел. Каждый элемент с
// i-ым индексом третьего массива должен равняться отношению элемента
// из первого массива с i-ым индексом к элементу из второго массива с
// i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке),
// затем вывести количество целых элементов в третьем массиве.
public class Main {

    public static void main(String[] args) {
        double a = 0;
        int b = 0;
        int[][] s = new int[2][10];
        double[] l = new double[10];
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                s[i][j] = (int) (Math.random() * 8 + 1);
                System.out.print(" " + s[i][j]);
            }
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            l[i] = (double) s[0][i] / s[1][i];

            System.out.print(l[i] + "   ");


        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            l[i] = (double) s[0][i] % s[1][i];
            if (l[i] == 0) {
                b = b + 1;
            }

        }
        System.out.print(" целых элементов в третьем массиве  " + b);


    }
}





