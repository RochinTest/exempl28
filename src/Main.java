import java.util.Arrays;

//). Создать программу, выводящую на экран случайно сгенерированное трёхзначное
// натуральное число и его наибольшую цифру.
//Примеры работы программы:
//В числе 208 наибольшая цифра 8
//В числе 774 наибольшая цифра 7
public class Main {

    public static void main(String[] args) {
        int a = 0, b = 0;
        int[] s = new int[5];
        int[] l = new int[5];
        for (int i = 0; i < 5; i++) {
            s[i] = (int) (Math.random() * 5);
            l[i] = (int) (Math.random() * 5);
            a = (a + s[i]);
            b = (b + l[i]);
        }
        a = a / 5;
        b = b / 5;
        {
        }

        Arrays.stream(s).forEach(System.out::print);
        System.out.println();
        Arrays.stream(l).forEach(System.out::print);
        System.out.println();
        if (a > b) System.out.println("среднее арифметическое масива 1 больше");
        else if (a < b) System.out.println("среднее арифметическое масива 2 больше");
        else System.out.println(" среднее арифметическое масивов равны");
    }
}

