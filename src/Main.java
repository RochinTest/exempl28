//). Создать программу, выводящую на экран случайно сгенерированное трёхзначное
// натуральное число и его наибольшую цифру.
//Примеры работы программы:
//В числе 208 наибольшая цифра 8
//В числе 774 наибольшая цифра 7
public class Main {

    public static void main(String[] args) {
        int[] s = new int[8];
        for (int i = 0; i < 8; i++) {
            s[i] = (int) (Math.random() * 9 + 1);
            System.out.print(s[i]);
        }
        System.out.println();
        for (int j = 0; j < 8; j++) {
            if (j % 2 == 0) {
                s[j] = 0;
            }
            System.out.print(s[j]);
        }
    }
}

