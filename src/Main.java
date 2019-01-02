import java.util.Arrays;

//). Создать программу, выводящую на экран случайно сгенерированное трёхзначное
// натуральное число и его наибольшую цифру.
//Примеры работы программы:
//В числе 208 наибольшая цифра 8
//В числе 774 наибольшая цифра 7
public class Main {

    public static void main(String[] args) {
        int a = 0;
        int[] s = new int[4];

        for (int i = 0; i < 4; i++) {
            s[i] = (int) (Math.random() * 89 + 10);
            System.out.print(" " + s[i]);
            //a = (a + s[i]);
            if (i >= 1 && s[i] > s[i - 1]) a = a + 1;
        }
        System.out.println( );
        if (a == 3) {
            System.out.println("последовательность возрастающая");
        } else System.out.println("последовательность не возрастающая");
    }
}

